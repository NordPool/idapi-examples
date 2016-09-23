
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for EnterLimitOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnterLimitOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{}EnterOrder">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "EnterLimitOrder", propOrder = {
    "productCode",
    "orderValidity"
})
@XmlSeeAlso({
    EnterIOCOrder.class,
    EnterFOKOrder.class,
    EnterMarketMakingLimitOrder.class,
    EnterIcebergOrder.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@XmlRootElement(name = "EnterLimitOrder")
public class EnterLimitOrder
    extends EnterOrder
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "OrderValidity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderValidity;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

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

}
