
package generated;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for PrivateIcebergOrderBookRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateIcebergOrderBookRow">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrivateOrderBookRow">
 *       &lt;sequence>
 *         &lt;element name="ClipPriceChange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ClipQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RemainingQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateIcebergOrderBookRow", propOrder = {
    "clipPriceChange",
    "clipQuantity",
    "remainingQuantity"
})
@XmlRootElement(name = "PrivateIcebergOrderBookRow")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrivateIcebergOrderBookRow
    extends PrivateOrderBookRow
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClipPriceChange", required = true)
    protected BigDecimal clipPriceChange;
    @XmlElement(name = "ClipQuantity")
    protected long clipQuantity;
    @XmlElement(name = "RemainingQuantity")
    protected Long remainingQuantity;

    /**
     * Gets the value of the clipPriceChange property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClipPriceChange() {
        return clipPriceChange;
    }

    /**
     * Sets the value of the clipPriceChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClipPriceChange(BigDecimal value) {
        this.clipPriceChange = value;
    }

    /**
     * Gets the value of the clipQuantity property.
     * 
     */
    public long getClipQuantity() {
        return clipQuantity;
    }

    /**
     * Sets the value of the clipQuantity property.
     * 
     */
    public void setClipQuantity(long value) {
        this.clipQuantity = value;
    }

    /**
     * Gets the value of the remainingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * Sets the value of the remainingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingQuantity(Long value) {
        this.remainingQuantity = value;
    }

}
