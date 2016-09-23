package npspot.rabbit_intraday_client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.io.IOUtils;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;
import org.json.JSONObject;

import generated.Request;

public class Util {

	private static Marshaller marshaller;
	private static Unmarshaller unmarshaller;

	private static JAXBContext jaxbContext;

	private static Configuration config;

	/**
	 * 
	 * @param source
	 * @return
	 * @throws IOException
	 */
	public static String compressAndB64EncodeString(String source) throws IOException {

		final byte[] sourceBytes = source.getBytes(Charset.forName("UTF-8"));
		byte[] zippedBytes;

		zippedBytes = sourceBytes;

		try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); GZIPOutputStream gos = new GZIPOutputStream(baos)) {
			gos.write(sourceBytes);
			gos.finish();
			zippedBytes = baos.toByteArray();
		}
		return Base64.getEncoder().encodeToString(zippedBytes);
	}

	/**
	 * Decompresses Zipped and base64 encoded string
	 *
	 * @param zippedBase64Str
	 *            zipped and base64 encoded source
	 * @return decompressed string
	 * @throws IOException
	 */
	public static String b64DecodeAndUncompressString(String zippedBase64Str) throws IOException {

		final byte[] deBase64Bytes = java.util.Base64.getDecoder().decode(zippedBase64Str);

		try (ByteArrayInputStream bais = new ByteArrayInputStream(deBase64Bytes); GZIPInputStream zi = new GZIPInputStream(bais)) {
			byte[] resultBytes = IOUtils.toByteArray(zi);
			return new String(resultBytes, Charset.forName("UTF-8"));
		}

	}

	/**
	 * @param jsonresponse
	 * @return
	 */
	public static String extractSSOTokenFromJson(String jsonresponse) {
		if (jsonresponse == null) {
			return null;
		}
		String token = null;

		final JSONObject obj = new JSONObject(jsonresponse);
		token = obj.getString("access_token");

		return token;
	}

	public static byte[] serializeEvent(Request event) throws JAXBException, IOException {
		String str = marshall(event);

		// if gzip is set for content-encoding:
		str = Util.compressAndB64EncodeString(str);

		byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
		return bytes;
	}

	public static Object deserializeEvent(String msg) throws JAXBException, IOException {
		String decodedMsg = Util.b64DecodeAndUncompressString(msg); // if gzip is set for content-encoding
		Object resp = unmarshall(decodedMsg);
		return resp;
	}

	/**
	 * Marshall a request, output: string
	 * 
	 * @param o
	 * @return
	 * @throws JAXBException
	 */
	private static String marshall(Request o) throws JAXBException {
		StringWriter sw = new StringWriter();
		try {
			getMarshaller().marshal(o, sw);
		} catch (RuntimeException | javax.xml.bind.JAXBException e) {
			System.err.println("Failed to marshall: " + o);
			System.err.println("  Error: " + e.getMessage());
		}
		final String result = sw.toString();

		return result;
	}

	/**
	 * Unmarshall a string, output: response
	 * 
	 * @param msg
	 * @return
	 * @throws JAXBException
	 */
	private static Object unmarshall(String msg) throws JAXBException {
		Object r = null;
		try {
			r = getUnmarshaller().unmarshal(new StringReader(msg));
		} catch (RuntimeException | javax.xml.bind.JAXBException e) {
			System.err.println("Failed to unmarshall: " + msg.substring(0, 20));
			throw e;
		}

		return r;
	}

	/**
	 * @return
	 */
	private static Marshaller getMarshaller() {

		if (marshaller != null) {
			return marshaller;
		}

		try {
			marshaller = getJaxbContext().createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		try {
			// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false); // needed in order to pass through
			// legacy communication layer
			// marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);

			if (useJsonMessages()) {
				// for JSON:
				marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
				marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
				marshaller.setProperty(MarshallerProperties.JSON_MARSHAL_EMPTY_COLLECTIONS, true);
				marshaller.setProperty(MarshallerProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
			} else {
				// for XML:
				marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/xml");
			}

		} catch (PropertyException e) {
			e.printStackTrace();
		}

		return marshaller;
	}

	/**
	 * @return
	 */
	private static Unmarshaller getUnmarshaller() {

		if (unmarshaller != null) {
			return unmarshaller;
		}

		try {
			unmarshaller = getJaxbContext().createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}

		try {
			if (useJsonMessages()) {
				// JSON
				unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE, "application/json");
				unmarshaller.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);
				unmarshaller.setProperty(UnmarshallerProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
			} else {
				// for XML:
				marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/xml");
			}

		} catch (PropertyException e) {
			e.printStackTrace();
		}

		return unmarshaller;
	}

	/**
	 * Create a context containing all classes generated from the schema Could separate the requests and responses for
	 * marshalling/unmarshalling but this time it is fine like this
	 * 
	 * @return the JaxbContext to be used for marshalling/unmarshalling
	 * 
	 */
	private static JAXBContext getJaxbContext() {

		if (jaxbContext != null) {
			return jaxbContext;
		}

		try {
			jaxbContext = JAXBContextFactory.createContext( "generated", null, null);
		} catch (JAXBException e1) {
			e1.printStackTrace();
		}

		return jaxbContext;

	}

	/**
	 * Loads the configration
	 * 
	 * @return
	 */
	private static boolean loadConfiguration(String filename) {

		boolean success = false;

		Parameters params = new Parameters();
		FileBasedConfigurationBuilder<FileBasedConfiguration> builder = new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
				.configure(params.properties().setFileName(filename));
		try {
			config = builder.getConfiguration();
			success = true;
		} catch (ConfigurationException cex) {
			System.err.println("Could not load configuration from file: " + filename);
		}

		return success;
	}

	/**
	 * Returns the configuration
	 * 
	 * @return
	 */
	public static Configuration getConfig() {
		return config;
	}

	/**
	 * @param filename
	 * @return
	 */
	public static boolean initConfig(String filename) {
		return loadConfiguration(filename);
	}

	public static boolean useJsonMessages() {
		return "json".equals(getConfig().getString("message.format"));
	}

	/**
	 * @return
	 */
	public static String getTimeStr() {
		return new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
	}

}
