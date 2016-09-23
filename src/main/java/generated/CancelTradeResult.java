
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for CancelTradeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelTradeResult">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorCode" type="{}ResponseErrorCodes" minOccurs="0"/>
 *         &lt;element name="TradeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelTradeResult", propOrder = {
    "success",
    "errorCode",
    "tradeNumber"
})
@XmlRootElement(name = "CancelTradeResult")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CancelTradeResult
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "ErrorCode")
    protected ResponseErrorCodes errorCode;
    @XmlElement(name = "TradeNumber")
    protected long tradeNumber;

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseErrorCodes }
     *     
     */
    public ResponseErrorCodes getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseErrorCodes }
     *     
     */
    public void setErrorCode(ResponseErrorCodes value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the tradeNumber property.
     * 
     */
    public long getTradeNumber() {
        return tradeNumber;
    }

    /**
     * Sets the value of the tradeNumber property.
     * 
     */
    public void setTradeNumber(long value) {
        this.tradeNumber = value;
    }

}
