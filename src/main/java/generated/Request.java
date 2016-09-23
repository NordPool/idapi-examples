
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "requestId"
})
@XmlSeeAlso({
    CancelOrders.class,
    InactivateOrders.class,
    CancelTradeAcceptRequest.class,
    ActivateOrders.class,
    OrderHistoryRequest.class,
    NetPositionRequest.class,
    LoginRequest.class,
    InitialRefreshRequest.class,
    ChangeOrder.class,
    CancelTradeRequest.class,
    UserSettingsRequest.class,
    AddOrUpdateUserSettings.class,
    TradeHistoryRequest.class,
    UserDataRequest.class,
    LogoutRequest.class,
    EnterOrder.class,
    SessionHeartBeat.class
})
@ToString
@EqualsAndHashCode
public abstract class Request implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

}
