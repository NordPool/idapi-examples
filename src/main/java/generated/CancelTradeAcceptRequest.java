
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
 * <p>Java class for CancelTradeAcceptRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelTradeAcceptRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{}Request">
 *       &lt;sequence>
 *         &lt;element name="Accepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CancelTradeAcceptRequest", propOrder = {
    "accepted",
    "tradeNumber"
})
@XmlRootElement(name = "CancelTradeAcceptRequest")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CancelTradeAcceptRequest
    extends Request
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Accepted")
    protected boolean accepted;
    @XmlElement(name = "TradeNumber")
    protected long tradeNumber;

    /**
     * Gets the value of the accepted property.
     * 
     */
    public boolean isAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     */
    public void setAccepted(boolean value) {
        this.accepted = value;
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
