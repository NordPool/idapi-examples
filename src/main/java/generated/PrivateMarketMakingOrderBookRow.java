
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
 * <p>Java class for PrivateMarketMakingOrderBookRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateMarketMakingOrderBookRow">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrivateOrderBookRow">
 *       &lt;sequence>
 *         &lt;element name="OriginalQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateMarketMakingOrderBookRow", propOrder = {
    "originalQuantity"
})
@XmlRootElement(name = "PrivateMarketMakingOrderBookRow")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrivateMarketMakingOrderBookRow
    extends PrivateOrderBookRow
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OriginalQuantity")
    protected Long originalQuantity;

    /**
     * Gets the value of the originalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalQuantity() {
        return originalQuantity;
    }

    /**
     * Sets the value of the originalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalQuantity(Long value) {
        this.originalQuantity = value;
    }

}
