
package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for MarketAreaDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketAreaDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MarketAreaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProductType" type="{}ProductType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketAreaDto", propOrder = {
    "marketAreaId",
    "marketAreaCode",
    "productTypes",
    "productTimeZone",
    "currencyCode"
})
@XmlRootElement(name = "MarketArea")
@ToString
@EqualsAndHashCode
public class MarketArea implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MarketAreaId")
    protected Long marketAreaId;
    @XmlElement(name = "MarketAreaCode", required = true)
    protected String marketAreaCode;
    @XmlElementWrapper(name = "ProductTypes")
    @XmlElement(name = "ProductType")
    protected List<ProductType> productTypes;
    @XmlElement(name = "ProductTimeZone")
    protected String productTimeZone;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;

    /**
     * Gets the value of the marketAreaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMarketAreaId() {
        return marketAreaId;
    }

    /**
     * Sets the value of the marketAreaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMarketAreaId(Long value) {
        this.marketAreaId = value;
    }

    /**
     * Gets the value of the marketAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketAreaCode() {
        return marketAreaCode;
    }

    /**
     * Sets the value of the marketAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketAreaCode(String value) {
        this.marketAreaCode = value;
    }

    /**
     * Gets the value of the productTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTimeZone() {
        return productTimeZone;
    }

    /**
     * Sets the value of the productTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTimeZone(String value) {
        this.productTimeZone = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    public List<ProductType> getProductTypes() {
        if (productTypes == null) {
            productTypes = new ArrayList<ProductType>();
        }
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

}
