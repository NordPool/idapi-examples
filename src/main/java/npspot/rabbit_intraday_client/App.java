package npspot.rabbit_intraday_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.configuration2.Configuration;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.AMQP.Queue.DeclareOk;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import generated.AreaOrderViewUpdate;
import generated.EnterFOKOrder;
import generated.EnterLimitOrder;
import generated.InitialRefreshRequest;
import generated.InitialRefreshResponse;
import generated.LoginRequest;
import generated.LoginResponse;
import generated.LogoutRequest;
import generated.LogoutResponse;
import generated.OrderAction;
import generated.Portfolio;
import generated.PrivateOrderResponse;
import generated.Request;
import generated.ResponseFail;
import generated.SessionHeartBeat;
import generated.SessionHeartBeatResponse;
import generated.UserDataRequest;
import generated.UserDataResponse;

/**
 * Simple program showing basic functionality of an ID API client.
 * e.g. connecting to RabbitMQ, logging in to the intraday server, performing basic tasks.
 * 
 * @author (c) 2016 Nord Pool  
 * 
 * Notes:
 * 
 * 1) Special maven plugins used:
 *    - jaxb-xew-plugin : avoid object wrappers wherever it is possible by using @XmlElementWrapper
 *    - xjc-lombok-plugin : makes the lombok work with JAXB
 * 
 * 2) Special libraries used:
 *    - lombok - to provide an easy way to know the JAXB objects contents (toString)
 *      more info: https://projectlombok.org/download.html
 *      You have to install the lombok agent to eclipse/your preferred IDE to make it work.
 *      
 * 3) search for this: (!) to find optional parts of code that can be enabled and values to be updated.
 *      
 */
public class App {

	// Connection parameters are loaded from this properties file, to be put where the pom file resides
	private static final String CONFIG_FILENAME = "intraday-client.properties";

	// Timings for RabbitMQ
	static final int RABBIT_CONN_TIMEOUT = 10000;
	static final int RABBIT_HANDSHAKE_TIMEOUT = 60000;
	static final long CHANNEL_CONN_TIMEOUT_MS = 60 * 1000;
	private static final long QUEUE_POLL_INTERVAL_MILLISECONDS = 300;

	// Possible bindings (routing keys)
	static final String SESSION_MANAGEMENT = "SESSION_MANAGEMENT";
	static final String MATCHER = "MATCHER";
	static final String SESSION_HEARTBEAT_MANAGEMENT = "SESSION_HEARTBEAT_MANAGEMENT";
	static final String INTEGRATION = "INTEGRATION";

	private Connection connection = null;
	private Channel outboundChannel;
	private Channel inboundChannel;

	private String token_sessionid = null; // value set at successful login (LoginResponse)
	private String activeQueueName; // holds the queue used for communication

	private String inboundConsumerTag; // stores the consumerTag to make it possible to cancel (for reconnection)
	private boolean firstLogin = true; // flag to avoid repeated logout if that scenario is used

	/**
	 * Constructor
	 */
	public App() {
		super();
		attachShutDownHook();
		Util.initConfig(CONFIG_FILENAME); // load configuration
	}

	/**
	 * returns the session id if any, or null in case no successful login has happened yet.
	 * 
	 * @return
	 */
	public String getToken() {
		return token_sessionid;
	}

	private void setToken(String token_sessionid) {
		this.token_sessionid = token_sessionid;
	}

	/**
	 * @param host
	 * @param port
	 * @param vhost
	 * @param username
	 * @param password
	 * @param ssl
	 * @param timeout
	 * @return
	 * @throws IOException
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws TimeoutException
	 */
	private Connection createConnectionToNode(String host, int port, String vhost, String username, String password, boolean ssl)
			throws IOException, KeyManagementException, NoSuchAlgorithmException, TimeoutException {

		System.out.printf("\nTrying to establish a RabbitMQ connection to %s:%d/%s with username %s ...\n", host, port, vhost, username);

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost(host);
		factory.setPort(port);
		factory.setVirtualHost(vhost);
		factory.setUsername(username);
		factory.setPassword(password);

		if (ssl) {
			factory.useSslProtocol("TLSv1.2");
		}

		factory.setConnectionTimeout(RABBIT_CONN_TIMEOUT);
		factory.setHandshakeTimeout(RABBIT_HANDSHAKE_TIMEOUT); // can be lower, but sometimes it is needs more time

		Connection connection = factory.newConnection();
		System.out.printf("Connection to %s (%s) was successful.\n\n", connection.getAddress(), connection.getPort());

		return connection;
	}

	/**
	 * Set up routine to be run when exiting.
	 */
	public void attachShutDownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutting down, cleaning up...");

				closeChannels();
				closeConnection();

				System.out.println("Bye!");
			}
		});
	}

	// Close the channels
	private void closeChannels() {
		if (outboundChannel != null && outboundChannel.isOpen()) {
			try {
				outboundChannel.close();
			} catch (IOException | TimeoutException e) {
				e.printStackTrace();
			}
		}

		if (inboundChannel != null && inboundChannel.isOpen()) {
			try {
				inboundChannel.close();
			} catch (IOException | TimeoutException e) {
				e.printStackTrace();
			}
		}
	}

	// Close connection
	private void closeConnection() {

		if (connection != null && connection.isOpen()) {
			try {
				connection.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Sending a login request
	 * 
	 * @param channel
	 * @param username
	 * @param password
	 * @param queueName
	 * @throws IOException
	 */
	private void sendLoginRequest(Channel channel, String username, String password, String queueName) throws IOException {
		LoginRequest loginRequest = createLoginMsg(username, password, queueName);
		publishMessage(loginRequest, outboundChannel, SESSION_MANAGEMENT);
	}

	/**
	 * Creating a channel
	 * 
	 * @param connection
	 * @return
	 * @throws IOException
	 */
	public Channel createChannel(Connection connection) throws IOException {
		System.out.println("Creating channel...");

		Channel channel = connection.createChannel();
		channel.basicQos(1);

		return channel;
	}

	/**
	 * Creating a login request
	 * 
	 * @param username
	 * @param password
	 * @param clientBuildInfo
	 * @return
	 */
	private LoginRequest createLoginMsg(String username, String password, String clientQueueName) {

		LoginRequest loginRequest = new LoginRequest();
		loginRequest.setRequestId(UUID.randomUUID().toString());

		loginRequest.setUserName(username);
		loginRequest.setPassword(password);
		loginRequest.setQueueName(clientQueueName);
		loginRequest.setPlatform(Util.getConfig().getString("platform_id"));
		loginRequest.setBatchUpdates(false);

		if (useJsonMessages()) {
			loginRequest.setContentType("json");
		} else {
			loginRequest.setContentType("xml");
		}

		loginRequest.setIsAdminClient(false); // always false

		return loginRequest;
	}

	/**
	 * Composing the basic properties for the message publishing.
	 * 
	 * @param session_token
	 * @return
	 */
	private AMQP.BasicProperties getBasicProperties(String session_token) {

		AMQP.BasicProperties.Builder p;

		if (useJsonMessages()) {
			// JSON:
			p = new AMQP.BasicProperties.Builder().appId(getConfig().getString("rabbitmq_appid")).contentType("application/json").contentEncoding("gzip");

		} else {
			// XML:
			p = new AMQP.BasicProperties.Builder().appId(getConfig().getString("rabbitmq_appid")).contentType("application/xml").contentEncoding("gzip");
		}

		// common - provide the token if we already have it
		if (session_token != null) {
			Map<String, Object> headers = new HashMap<>();
			headers.put("token", session_token);
			p.headers(headers);
		}

		return p.build();
	}

	/**
	 * Getting a token for our user
	 * 
	 * @param ssoUser SSO user name
	 * @param ssoPassword SSO password
	 * @return
	 */
	private String getSSOTokenResponse(String ssoUser, String ssoPassword) {

		String resp = null;

		try {
			DefaultHttpClient httpClient = new DefaultHttpClient();

			// Build up the POST request:
			HttpPost req = new HttpPost(getConfig().getString("sso.url"));

			req.addHeader("Authorization", "Basic Y2xpZW50X2ludHJhZGF5X2FwaToxeEI5SWsxeHNFdTJuYndWYTFCUg==");
			req.addHeader("Content-Type", "application/x-www-form-urlencoded");

			String body = "grant_type=password&username=" + ssoUser + "&password=" + ssoPassword + "&scope=intraday_api";
			StringEntity xmlEntity = new StringEntity(body);
			req.setEntity(xmlEntity);

			HttpResponse response = httpClient.execute(req);

			if (response.getStatusLine().getStatusCode() != 200) {
				System.err.println(
						"Failed : HTTP error code : " + response.getStatusLine().getStatusCode() + ", message: " + response.getStatusLine().getReasonPhrase());
			}

			// debug - only if needed:
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			System.out.println("Output from Server: \n");
			String output;
			while ((output = br.readLine()) != null) {
				resp = output;
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return resp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		
		
//		// TESTING................
//		// EnterFOKOrder order = new EnterFOKOrder(); // ez jo
//		EnterLimitOrder order = new EnterLimitOrder(); // @XmlRootElement(name = "EnterLimitOrder") - hianyzik! Miert?
//		
//		order.setPortfolioId(522); // (!) check this: use a portfolio you have access to (by portfolio Id)
//		order.setMarketAreaCode("FI");
//		order.setProductCode("20160919_20:00"); // (!) check this: it has to be a valid product
//		order.setOrderAction(OrderAction.BUY);
//		order.setPrice(new BigDecimal(10.0));
//		order.setQuantity(100);
//
//		order.setFreeText("This is a label, visible in the GUI"); // (!) check this: an optional label - a user-friendly string is the best
//		order.setLocalTraderId(UUID.randomUUID().toString());     // your UUID (optional) to track your own order
//		order.setInactive(false);
//		
//		order.setRequestId("TestingRequestIdMeri_12345");
//		
//
//		Request req = order; 
//		byte[] bytes = null;
//		try {
//			bytes = Util.serializeEvent(req);
//			if (bytes != null) {
//				String sRequest = Util.b64DecodeAndUncompressString(new String(bytes));
//				System.out.println("\n --> request: \n " + sRequest);
//			} else {
//				System.err.println(" Serialization failed for request: " + req);
//			}
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		if (true)
//			return;
		
		// TESTING ENDS ...................

		System.out.println("Getting SSO token : " + getConfig().getString("sso.username") + " ...");
		String jsonResponse = app.getSSOTokenResponse(getConfig().getString("sso.username"), getConfig().getString("sso.password"));
		System.out.println("Got a response: " + jsonResponse);

		System.out.println("\nTrying to extract the SSO token...");
		String ssoToken = Util.extractSSOTokenFromJson(jsonResponse);
		System.out.println("Got SSO token: " + ssoToken);

		if (ssoToken != null) {
			app.runSimpleTest(ssoToken);
		}

	}

	/**
	 * Creating a connection to the RabbitMQ server
	 * 
	 * @param ssoToken
	 * @return
	 * @throws KeyManagementException
	 * @throws NoSuchAlgorithmException
	 * @throws IOException
	 * @throws TimeoutException
	 */
	private Connection initRabbitConnections(String ssoToken) throws KeyManagementException, NoSuchAlgorithmException, IOException, TimeoutException {
		connection = createConnectionToNode(getConfig().getString("rabbitmq.host"), getConfig().getInt("rabbitmq.port"),
				getConfig().getString("rabbitmq.vhost"), getConfig().getString("sso.username"), ssoToken, getConfig().getBoolean("rabbitmq.ssl"));
		return connection;
	}

	private void runSimpleTest(String ssoToken) {
		try {
			connection = initRabbitConnections(ssoToken);

			outboundChannel = createChannel(connection);
			inboundChannel = createChannel(connection);

			// Generate a queue name:
			activeQueueName = "CLIENT_QUEUE_" + UUID.randomUUID().toString();

			// Send loginRequest to the outbound channel:
			sendLoginRequest(outboundChannel, getConfig().getString("intraday.username"), getConfig().getString("intraday.password"), activeQueueName);

			// Wait for the server to create a client queue for us:
			boolean queueFound = waitForMyQueueToBeCreated(activeQueueName);

			if (!queueFound) {
				System.err.println("Queue could not be found, exiting.");
				System.exit(0);
			}

			// Wait for the login response:
			startWaitingForResponses(activeQueueName);

			// Let's wait a bit before ending the app and closing the channels / connections
			try {
				System.out.println("waiting...");
				Thread.sleep(120 * 60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} catch (KeyManagementException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nSiple test ended.");
		}

		System.exit(0);

	}

	/**
	 * Waits for the appropriate queue to appear. In case of a successful login, the queue is created by the server.
	 * 
	 * @param queueName
	 * @return
	 * @throws IOException
	 */
	private boolean waitForMyQueueToBeCreated(String queueName) throws IOException {
		int loop = 1;
		long startTime = Clock.systemUTC().millis();
		long timeoutTime = startTime + CHANNEL_CONN_TIMEOUT_MS;

		do {
			if (checkQueue(queueName)) {
				return true;
			} else {
				System.out.printf("Return queue lookup was not found on try %s, after %s ms.", loop, Clock.systemUTC().millis() - startTime);
				shortWait();
			}
			loop++;
		} while (Clock.systemUTC().millis() < timeoutTime);

		return false;
	}

	/**
	 * Start waiting for any response to arrive
	 * 
	 * @param queueName
	 */
	private void startWaitingForResponses(String queueName) {
		Consumer consumer = new DefaultConsumer(inboundChannel) {

			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

				// added 8/4/2016 - message type is now available also in the BasicProperties, using original class
				// names:
				if (properties != null) {
					System.out.printf("\n\nMessage of class %s has been received.", properties.getType());
				}

				String message = new String(body, "UTF-8");
				handleResponse(message);
			}

		};

		try {
			inboundConsumerTag = inboundChannel.basicConsume(queueName, true, consumer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Cancelling our consumer - no more message handling on this queue.
	 * 
	 * @param consumerTag
	 */
	private boolean stopHandlingResponses(String consumerTag) {
		boolean ok = false;
		try {
			System.out.println("Canceling consumer with tag " + consumerTag);
			inboundChannel.basicCancel(consumerTag);
			ok = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return ok;
	}

	/**
	 * @param msgStrUnzippedAndDecoded
	 */
	private void handleResponse(String originalRespMessage) {

		// DEBUG ONLY:
		// System.out.println("Received a message: '" + originalRespMessage + "'");

		// Be aware that message might be huge, e.g. in case of InitialRefresh.

		// try {
		// String msgStrUnzippedAndDecoded = Util.b64DecodeAndUncompressString(originalRespMessage);
		// System.out.println("\n <-- RESPONSE received: '" + msgStrUnzippedAndDecoded + "'");
		// } catch (IOException e1) {
		// System.err.println("ERROR while trying to deserialize response: " + originalRespMessage);
		// e1.printStackTrace();
		// }

		Object resp = null;

		// Unmarshall the message first
		try {
			System.out.printf("\nSize of message: %s time: %s \n", originalRespMessage.length(), Util.getTimeStr());
			resp = Util.deserializeEvent(originalRespMessage);
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (resp != null) {
			System.out.println("\nGot a response: [" + resp.getClass().getSimpleName() + "]");
		} else {
			System.err.println("Can't understand this response (converts to null): " + originalRespMessage);
		}

		if (resp instanceof LoginResponse) {
			// Handling LoginResponse: extract the token to be used in all further requests
			LoginResponse r = (LoginResponse) resp;
			setToken(r.getSessionId()); // remember ourt token (AKA session ID)

			System.out.println("Got session id to be used as the token for further requests: " + getToken());

			// Logged in, so let's do the initial/basic subscriptions:
			subscribeInitialFeeds(outboundChannel);

			//subscribeTradeCapturingFeeds(outboundChannel);

		} else

		if (resp instanceof InitialRefreshResponse) {
			// Handling InitialRefreshResponse
			InitialRefreshResponse irr = (InitialRefreshResponse) resp;

			System.out.println("Market areas:");
//			List<MarketArea> areas = irr.getMarketAreas();
//			if (areas == null) {
//				System.out.println("none.");
//			} else {
//				// for (MarketArea a : areas) {
//				// System.out.print(" " + a.getMarketAreaCode() + ",");
//				// }
//				System.out.println(areas.size() + " pcs");
//				// System.out.println();
//			}
			//System.out.println(irr.getMarketAreas());

			System.out.println();
			
			System.out.println("Products:");
//			List<Product> products = irr.getProducts();
//			if (products == null) {
//				System.out.println("none. Too bad... should never occur!");
//			} else {
//				// for (Product prod : products) {
//				// System.out.print(" " + prod.getDisplayName() + "/" + prod.getMarketAreaCode() + ",");
//				// }
//				System.out.println(products.size() + " pcs");
//			}
			System.out.println(irr.getProducts());

			/* 
			 * These scenarios can be used to test several common use cases - please feel free to uncomment them one by one, according to your needs.
			 */
			
			// (1) Logging out, then attempting to log in again (timed, 15 seconds)

			/* 
			// (!) uncomment this to test:
			if (firstLogin) {
				firstLogin = false; // no more tests like that
				runscenario_Reconnect();
			}
			*/

			// (2) Sending an order (check and update the product first!) (immediate)
			runscenario_sendLimitOrder(); // (!) uncomment this to test 

		} else

		if (resp instanceof UserDataResponse) {
			// Handling UserDataResponse
			UserDataResponse udr = (UserDataResponse) resp;

			// heartbeat interval
			long hbInterval = udr.getHeartbeatFrequency();

			System.out.println("\nStart sending heartbeats, interval: " + (hbInterval / 1000) + " s");
			startHeartbeats(hbInterval);

			// List of portfolios
			System.out.println("User's portfolios: ");
			List<Portfolio> portfolios = udr.getPortfolios();

			if (portfolios == null) {
				System.out.println("none.");
			} else {
				// for (Portfolio pf : portfolios) {
				// System.out.println(" " + pf.getName());
				// }
				System.out.println(portfolios.size() + " pcs");
			}

		} else

		if (resp instanceof ResponseFail) {
			ResponseFail rf = (ResponseFail) resp;
			System.out.println("ERROR: ResponseFail received. Error code = " + rf.getErrorCode());
		} else

		if (resp instanceof PrivateOrderResponse) {
			PrivateOrderResponse privateOrderResponse = (PrivateOrderResponse) resp;
			System.out.println(privateOrderResponse);

		} else

		if (resp instanceof LogoutResponse) {
			System.out.println("Logged out.");
			
			// stopping heartbeats
			stopHeartbeats();
			setToken(null); // invalidate the session token
			
			// Try to cancel the consumer:
			if (!stopHandlingResponses(inboundConsumerTag)) {
				System.err.println("Failed to stop consumer.");
			}
			
			closeChannels();

		} else

			
		if (resp instanceof AreaOrderViewUpdate) {
			AreaOrderViewUpdate areaOVUpdate = (AreaOrderViewUpdate) resp;
			System.out.println(areaOVUpdate);
		} else
			
		if (resp instanceof PrivateOrderResponse) {
			PrivateOrderResponse privateOBResp = (PrivateOrderResponse) resp;
			System.out.println(privateOBResp);
		} else

		if (resp instanceof SessionHeartBeatResponse) {
			// nop - can check if we got a response in time to out request for sure
		} else

		// SessionHeartBeatResponse, PrivateOrderResponse, AreaOrderViewUpdate, PublicHubToHubUpdate
		{
			// Unhandled responses fall here...
			if (resp != null) {
				System.out.println("Unhandled response for class: " + resp.getClass().getSimpleName());
			} else {
				System.out.println("Was unable to get real response, value is NULL.");
			}

		}

		/*
		 * Handling further responses here...
		 * 
		 */

	}

	/**
	 * Check queue with passive declare. Will make sure channel is closed anyways.
	 * 
	 * @return true if queue was found, false if not.
	 * @throws IOException
	 *             if rabbitmq is not reachable at all, this will be thrown.
	 */
	private boolean checkQueue(String queueName) throws IOException {
		Channel tempChannel = createChannel(connection);

		try {
			System.out.printf("Looking for queue: %s", queueName + "\n");
			DeclareOk resp = tempChannel.queueDeclarePassive(queueName);

			System.out.printf("Return queue found, name %s", resp.getQueue() + "\n");
			return true;
		} catch (IOException e) {
			// System.err.println("got error, so still waiting for queue..");
			// e.printStackTrace();
			// it is normal if not getting anything for the first (couple of) tries
		} finally {
			try {
				tempChannel.close();
			} catch (Exception e) {
				// ignore everything
			}
		}
		return false;
	}

	/**
	 * a short sleep to wait for our queue to appear
	 */
	private void shortWait() {
		try {
			System.out.println("\nWaiting for queues...");
			Thread.sleep(QUEUE_POLL_INTERVAL_MILLISECONDS);
		} catch (InterruptedException e) {

		}
	}

	/**
	 * Perform initial subscriptions: user and initial data
	 */
	private void subscribeInitialFeeds(Channel ch) {

		System.out.println("\nSending UserDataRequest ...");
		publishMessage(new UserDataRequest(), outboundChannel, SESSION_MANAGEMENT);

		System.out.println("\nSending InitialRefreshRequest ...");
		publishMessage(new InitialRefreshRequest(), outboundChannel, MATCHER);

	}

	/**
	 * Publishing a message...
	 * 
	 * @param req
	 * @param ch
	 * @param routingKey
	 */
	private void publishMessage(Request req, Channel ch, String routingKey) {

		byte[] bytes = null;

		try {
			bytes = Util.serializeEvent(req);

			if (bytes != null) {
				
				// token is NULL in case of a LoginRequest, but must contain the session id for all further requests.
				AMQP.BasicProperties props = getBasicProperties(getToken());

				ch.basicPublish(getConfig().getString("rabbitmq.exchange"), routingKey, props, bytes);

				String sRequest = Util.b64DecodeAndUncompressString(new String(bytes));
				System.out.println("\n --> REQUEST has been sent: \n " + sRequest);

			} else {
				System.err.println(" Serialization failed for request: " + req);
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Start sending heartbeats
	 */
	private Timer heartBeatSenderTimer;

	private void startHeartbeats(long heartbeatInterval) {

		if (heartBeatSenderTimer != null) {
			heartBeatSenderTimer.cancel();
		}

		heartBeatSenderTimer = new Timer();

		heartBeatSenderTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("\nSending heartbeat request.");
				publishMessage(new SessionHeartBeat(), outboundChannel, SESSION_HEARTBEAT_MANAGEMENT);
			}
		}, 0, heartbeatInterval);

	}

	/**
	 * Stop sending heartbeat messages
	 */
	private void stopHeartbeats() {

		if (heartBeatSenderTimer != null) {
			heartBeatSenderTimer.cancel();
		}
	}


	/**
	 * @param channel
	 * @throws IOException
	 */
	private void sendLogoutRequest() {
		System.out.println("Logging out now...");
		LogoutRequest logoutRequest = new LogoutRequest();
		logoutRequest.setRequestId(UUID.randomUUID().toString());
		publishMessage(logoutRequest, outboundChannel, SESSION_MANAGEMENT);
	}

	/**
	 * @return
	 */
	private static final Configuration getConfig() {
		return Util.getConfig();
	}

	/**
	 * Scenario: logout and reconnect
	 */
	private void runscenario_Reconnect() {
		
		// Trying to force log out and reconnect after 15 seconds
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {

				// Stopping heartbeats:
				stopHeartbeats();

				// Logging out:
				sendLogoutRequest();

			}
		}, 15000);

		// TEMP: Trying to re-login
		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {

				// We have to re-create the connection and the channels
				try {
					// connection = initRabbitConnections(token_sessionid);
					outboundChannel = createChannel(connection);
					inboundChannel = createChannel(connection);
				// } catch (IOException | KeyManagementException | NoSuchAlgorithmException | TimeoutException e) {
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Generate a new queue name:
				String newQueueName = "CLIENT_QUEUE_" + UUID.randomUUID().toString();

				try {

					// Send loginRequest to the outbound channel:
					sendLoginRequest(outboundChannel, getConfig().getString("intraday.username"), getConfig().getString("intraday.password"), newQueueName);

					// Wait for the server to create a client queue for us:
					boolean queueFound = waitForMyQueueToBeCreated(newQueueName);

					if (queueFound) {
						activeQueueName = newQueueName;
						startWaitingForResponses(activeQueueName);
					}

				} catch (Exception e) {
					System.err.println("Second login has failed...");
				}

			}
		}, 30000);
	}
	
	
	/**
	 * Sending a limit order. Check the portfolio (you have to have access to it) and the product (has to be valid) 
	 */
	private void runscenario_sendLimitOrder() {
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("\nSending LimitOrder ...");

		EnterLimitOrder order = new EnterLimitOrder();
		
		order.setPortfolioId(522); // (!) check this: use a portfolio you have access to (by portfolio Id)
		order.setMarketAreaCode("FI");
		order.setProductCode("20160919_19:00"); // (!) check this: it has to be a valid product
		order.setOrderAction(OrderAction.BUY);
		order.setPrice(new BigDecimal(10.0));
		order.setQuantity(1000); // 

		order.setFreeText("This is a label, visible in the GUI"); // (!) check this: an optional label - a user-friendly string is the best
		order.setLocalTraderId(UUID.randomUUID().toString());     // your UUID (optional) to track your own order
		order.setInactive(false);
		
		order.setRequestId("TestingRequestIdMeri_12345");
		// order.setRequestId(UUID.randomUUID().toString());

		publishMessage(order, outboundChannel, MATCHER);
	}

	
	/**
	 * Returns true if "json" is the chosen format.
	 * 
	 * @return
	 */
	private static boolean useJsonMessages(){
		return Util.useJsonMessages();
	}

}
