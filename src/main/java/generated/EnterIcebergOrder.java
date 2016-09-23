
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
 * <p>Java class for EnterIcebergOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnterIcebergOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{}EnterLimitOrder">
 *       &lt;sequence>
 *         &lt;element name="ClipPriceChange" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ClipSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterIcebergOrder", propOrder = {
    "clipPriceChange",
    "clipSize"
})
@XmlRootElement(name = "EnterIcebergOrder")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnterIcebergOrder
    extends EnterLimitOrder
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ClipPriceChange", required = true)
    protected BigDecimal clipPriceChange;
    @XmlElement(name = "ClipSize")
    protected int clipSize;

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
     * Gets the value of the clipSize property.
     * 
     */
    public int getClipSize() {
        return clipSize;
    }

    /**
     * Sets the value of the clipSize property.
     * 
     */
    public void setClipSize(int value) {
        this.clipSize = value;
    }

}
