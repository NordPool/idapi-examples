
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
 * <p>Java class for MarketMessageUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketMessageUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{}PushUpdate">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{}MarketMessageDto"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketMessageUpdate", propOrder = {
    "message"
})
@XmlRootElement(name = "MarketMessageUpdate")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class MarketMessageUpdate
    extends PushUpdate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Message", required = true)
    protected MarketMessage message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MarketMessage }
     *     
     */
    public MarketMessage getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketMessage }
     *     
     */
    public void setMessage(MarketMessage value) {
        this.message = value;
    }

}
