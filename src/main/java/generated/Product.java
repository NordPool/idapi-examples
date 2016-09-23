
package generated;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * <p>Java class for ProductDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductStatus" type="{}ProductStatus"/>
 *         &lt;element name="ProductType" type="{}ProductType"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DayAheadPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FirstOfDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OpenAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CloseAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PeriodFromTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PeriodFromTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PeriodToTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PeriodToTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDto", propOrder = {
    "productCode",
    "marketAreaCode",
    "productStatus",
    "productType",
    "displayName",
    "fromTime",
    "dayAheadPrice",
    "firstOfDay",
    "openAt",
    "closeAt",
    "periodFromTimes",
    "periodToTimes"
})
@XmlRootElement(name = "Product")
@ToString
@EqualsAndHashCode
public class Product implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "MarketAreaCode", required = true)
    protected String marketAreaCode;
    @XmlElement(name = "ProductStatus", required = true)
    protected ProductStatus productStatus;
    @XmlElement(name = "ProductType", required = true)
    protected ProductType productType;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "FromTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromTime;
    @XmlElement(name = "DayAheadPrice")
    protected BigDecimal dayAheadPrice;
    @XmlElement(name = "FirstOfDay")
    protected boolean firstOfDay;
    @XmlElement(name = "OpenAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openAt;
    @XmlElement(name = "CloseAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar closeAt;
    @XmlElementWrapper(name = "PeriodFromTimes")
    @XmlElement(name = "PeriodFromTime")
    protected List<XMLGregorianCalendar> periodFromTimes;
    @XmlElementWrapper(name = "PeriodToTimes")
    @XmlElement(name = "PeriodToTime")
    protected List<XMLGregorianCalendar> periodToTimes;

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
     * Gets the value of the productStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getProductStatus() {
        return productStatus;
    }

    /**
     * Sets the value of the productStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setProductStatus(ProductStatus value) {
        this.productStatus = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProductType(ProductType value) {
        this.productType = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromTime(XMLGregorianCalendar value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the dayAheadPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDayAheadPrice() {
        return dayAheadPrice;
    }

    /**
     * Sets the value of the dayAheadPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDayAheadPrice(BigDecimal value) {
        this.dayAheadPrice = value;
    }

    /**
     * Gets the value of the firstOfDay property.
     * 
     */
    public boolean isFirstOfDay() {
        return firstOfDay;
    }

    /**
     * Sets the value of the firstOfDay property.
     * 
     */
    public void setFirstOfDay(boolean value) {
        this.firstOfDay = value;
    }

    /**
     * Gets the value of the openAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenAt() {
        return openAt;
    }

    /**
     * Sets the value of the openAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenAt(XMLGregorianCalendar value) {
        this.openAt = value;
    }

    /**
     * Gets the value of the closeAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseAt() {
        return closeAt;
    }

    /**
     * Sets the value of the closeAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCloseAt(XMLGregorianCalendar value) {
        this.closeAt = value;
    }

    public List<XMLGregorianCalendar> getPeriodFromTimes() {
        if (periodFromTimes == null) {
            periodFromTimes = new ArrayList<XMLGregorianCalendar>();
        }
        return periodFromTimes;
    }

    public void setPeriodFromTimes(List<XMLGregorianCalendar> periodFromTimes) {
        this.periodFromTimes = periodFromTimes;
    }

    public List<XMLGregorianCalendar> getPeriodToTimes() {
        if (periodToTimes == null) {
            periodToTimes = new ArrayList<XMLGregorianCalendar>();
        }
        return periodToTimes;
    }

    public void setPeriodToTimes(List<XMLGregorianCalendar> periodToTimes) {
        this.periodToTimes = periodToTimes;
    }

}
