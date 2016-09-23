
package generated;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for OrderHistoryRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHistoryRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastUpdatedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PreviousOrderNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OriginalOrderNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ValidityTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortfolioName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{}OrderType"/>
 *         &lt;element name="RemainingQty" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="BuySell" type="{}OrderAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHistoryRow", propOrder = {
    "displayName",
    "originalTimestamp",
    "lastUpdatedTimestamp",
    "orderNo",
    "previousOrderNo",
    "originalOrderNo",
    "validityTimestamp",
    "quantity",
    "unitPrice",
    "userCode",
    "marketArea",
    "status",
    "portfolioName",
    "companyName",
    "originalOrder",
    "label",
    "orderType",
    "remainingQty",
    "buySell"
})
@XmlRootElement(name = "OrderHistoryRow")
@ToString
@EqualsAndHashCode
public class OrderHistoryRow implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "OriginalTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTimestamp;
    @XmlElement(name = "LastUpdatedTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdatedTimestamp;
    @XmlElement(name = "OrderNo")
    protected long orderNo;
    @XmlElement(name = "PreviousOrderNo")
    protected Long previousOrderNo;
    @XmlElement(name = "OriginalOrderNo")
    protected Long originalOrderNo;
    @XmlElement(name = "ValidityTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityTimestamp;
    @XmlElement(name = "Quantity")
    protected long quantity;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "UserCode")
    protected String userCode;
    @XmlElement(name = "MarketArea")
    protected String marketArea;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "PortfolioName")
    protected String portfolioName;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "OriginalOrder")
    protected boolean originalOrder;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "OrderType", required = true)
    protected OrderType orderType;
    @XmlElement(name = "RemainingQty")
    protected Long remainingQty;
    @XmlElement(name = "BuySell", required = true)
    protected OrderAction buySell;

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
     * Gets the value of the originalTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTimestamp() {
        return originalTimestamp;
    }

    /**
     * Sets the value of the originalTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTimestamp(XMLGregorianCalendar value) {
        this.originalTimestamp = value;
    }

    /**
     * Gets the value of the lastUpdatedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    /**
     * Sets the value of the lastUpdatedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedTimestamp(XMLGregorianCalendar value) {
        this.lastUpdatedTimestamp = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     */
    public long getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     */
    public void setOrderNo(long value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the previousOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPreviousOrderNo() {
        return previousOrderNo;
    }

    /**
     * Sets the value of the previousOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPreviousOrderNo(Long value) {
        this.previousOrderNo = value;
    }

    /**
     * Gets the value of the originalOrderNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalOrderNo() {
        return originalOrderNo;
    }

    /**
     * Sets the value of the originalOrderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalOrderNo(Long value) {
        this.originalOrderNo = value;
    }

    /**
     * Gets the value of the validityTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityTimestamp() {
        return validityTimestamp;
    }

    /**
     * Sets the value of the validityTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityTimestamp(XMLGregorianCalendar value) {
        this.validityTimestamp = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the marketArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketArea() {
        return marketArea;
    }

    /**
     * Sets the value of the marketArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketArea(String value) {
        this.marketArea = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the originalOrder property.
     * 
     */
    public boolean isOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     * 
     */
    public void setOriginalOrder(boolean value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrderType(OrderType value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the remainingQty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemainingQty() {
        return remainingQty;
    }

    /**
     * Sets the value of the remainingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemainingQty(Long value) {
        this.remainingQty = value;
    }

    /**
     * Gets the value of the buySell property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAction }
     *     
     */
    public OrderAction getBuySell() {
        return buySell;
    }

    /**
     * Sets the value of the buySell property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAction }
     *     
     */
    public void setBuySell(OrderAction value) {
        this.buySell = value;
    }

}
