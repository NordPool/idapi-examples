
package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for EnterBlockOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnterBlockOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{}EnterOrder">
 *       &lt;sequence>
 *         &lt;element name="ProductCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrderValidity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterBlockOrder", propOrder = {
    "productCodes",
    "orderValidity"
})
@XmlRootElement(name = "EnterBlockOrder")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnterBlockOrder
    extends EnterOrder
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "ProductCodes")
    @XmlElement(name = "ProductCode")
    protected List<String> productCodes;
    @XmlElement(name = "OrderValidity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderValidity;

    /**
     * Gets the value of the orderValidity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderValidity() {
        return orderValidity;
    }

    /**
     * Sets the value of the orderValidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderValidity(XMLGregorianCalendar value) {
        this.orderValidity = value;
    }

    public List<String> getProductCodes() {
        if (productCodes == null) {
            productCodes = new ArrayList<String>();
        }
        return productCodes;
    }

    public void setProductCodes(List<String> productCodes) {
        this.productCodes = productCodes;
    }

}
