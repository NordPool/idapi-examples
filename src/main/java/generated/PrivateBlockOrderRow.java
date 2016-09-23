
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
 * <p>Java class for PrivateBlockOrderRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateBlockOrderRow">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrivateOrderBookRow">
 *       &lt;sequence>
 *         &lt;element name="BlockOrderProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateBlockOrderRow", propOrder = {
    "blockOrderProduct"
})
@XmlRootElement(name = "PrivateBlockOrderRow")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrivateBlockOrderRow
    extends PrivateOrderBookRow
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BlockOrderProduct", required = true)
    protected String blockOrderProduct;

    /**
     * Gets the value of the blockOrderProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockOrderProduct() {
        return blockOrderProduct;
    }

    /**
     * Sets the value of the blockOrderProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockOrderProduct(String value) {
        this.blockOrderProduct = value;
    }

}
