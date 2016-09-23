
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
 * <p>Java class for NetPositionRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetPositionRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortfolioName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Bought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Sold" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="From1To2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="From2To1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FromMarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToMarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPositionRow", propOrder = {
    "portfolioName",
    "productCode",
    "productDisplayName",
    "productType",
    "position",
    "bought",
    "sold",
    "from1To2",
    "from2To1",
    "fromMarketAreaCode",
    "toMarketAreaCode"
})
@XmlRootElement(name = "NetPositionRow")
@ToString
@EqualsAndHashCode
public class NetPositionRow implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PortfolioName")
    protected String portfolioName;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "ProductDisplayName")
    protected String productDisplayName;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "Position")
    protected Long position;
    @XmlElement(name = "Bought")
    protected Long bought;
    @XmlElement(name = "Sold")
    protected Long sold;
    @XmlElement(name = "From1To2")
    protected Long from1To2;
    @XmlElement(name = "From2To1")
    protected Long from2To1;
    @XmlElement(name = "FromMarketAreaCode")
    protected String fromMarketAreaCode;
    @XmlElement(name = "ToMarketAreaCode")
    protected String toMarketAreaCode;

    /**
     * Gets the value of the portfolioName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioName() {
        return portfolioName;
    }

    /**
     * Sets the value of the portfolioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioName(String value) {
        this.portfolioName = value;
    }

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
     * Gets the value of the productDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDisplayName() {
        return productDisplayName;
    }

    /**
     * Sets the value of the productDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDisplayName(String value) {
        this.productDisplayName = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosition(Long value) {
        this.position = value;
    }

    /**
     * Gets the value of the bought property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBought() {
        return bought;
    }

    /**
     * Sets the value of the bought property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBought(Long value) {
        this.bought = value;
    }

    /**
     * Gets the value of the sold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSold() {
        return sold;
    }

    /**
     * Sets the value of the sold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSold(Long value) {
        this.sold = value;
    }

    /**
     * Gets the value of the from1To2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFrom1To2() {
        return from1To2;
    }

    /**
     * Sets the value of the from1To2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFrom1To2(Long value) {
        this.from1To2 = value;
    }

    /**
     * Gets the value of the from2To1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFrom2To1() {
        return from2To1;
    }

    /**
     * Sets the value of the from2To1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFrom2To1(Long value) {
        this.from2To1 = value;
    }

    /**
     * Gets the value of the fromMarketAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromMarketAreaCode() {
        return fromMarketAreaCode;
    }

    /**
     * Sets the value of the fromMarketAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromMarketAreaCode(String value) {
        this.fromMarketAreaCode = value;
    }

    /**
     * Gets the value of the toMarketAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToMarketAreaCode() {
        return toMarketAreaCode;
    }

    /**
     * Sets the value of the toMarketAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToMarketAreaCode(String value) {
        this.toMarketAreaCode = value;
    }

}
