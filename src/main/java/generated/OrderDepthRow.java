
package generated;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for OrderDepthRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDepthRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OriginalOrderNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VisibleQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ActionCode" type="{}OrderAction"/>
 *         &lt;element name="OrderTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{}OrderStatus"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PriorityTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MarketMaking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LocalTraderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDepthRow", propOrder = {
    "orderNo",
    "unitPrice",
    "originalOrderNo",
    "visibleQuantity",
    "actionCode",
    "orderTime",
    "marketAreaCode",
    "orderStatus",
    "productCode",
    "priorityTimeStamp",
    "marketMaking",
    "localTraderId"
})
@XmlSeeAlso({
    PrivateOrderBookRow.class
})
@ToString
@EqualsAndHashCode
public class OrderDepthRow implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrderNo")
    protected long orderNo;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "OriginalOrderNo")
    protected long originalOrderNo;
    @XmlElement(name = "VisibleQuantity")
    protected Long visibleQuantity;
    @XmlElement(name = "ActionCode", required = true)
    protected OrderAction actionCode;
    @XmlElement(name = "OrderTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderTime;
    @XmlElement(name = "MarketAreaCode")
    protected String marketAreaCode;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderStatus orderStatus;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "PriorityTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar priorityTimeStamp;
    @XmlElement(name = "MarketMaking")
    protected boolean marketMaking;
    @XmlElement(name = "LocalTraderId")
    protected String localTraderId;

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
     * Gets the value of the originalOrderNo property.
     * 
     */
    public long getOriginalOrderNo() {
        return originalOrderNo;
    }

    /**
     * Sets the value of the originalOrderNo property.
     * 
     */
    public void setOriginalOrderNo(long value) {
        this.originalOrderNo = value;
    }

    /**
     * Gets the value of the visibleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVisibleQuantity() {
        return visibleQuantity;
    }

    /**
     * Sets the value of the visibleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVisibleQuantity(Long value) {
        this.visibleQuantity = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAction }
     *     
     */
    public OrderAction getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAction }
     *     
     */
    public void setActionCode(OrderAction value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the orderTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderTime() {
        return orderTime;
    }

    /**
     * Sets the value of the orderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderTime(XMLGregorianCalendar value) {
        this.orderTime = value;
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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
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
     * Gets the value of the priorityTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPriorityTimeStamp() {
        return priorityTimeStamp;
    }

    /**
     * Sets the value of the priorityTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPriorityTimeStamp(XMLGregorianCalendar value) {
        this.priorityTimeStamp = value;
    }

    /**
     * Gets the value of the marketMaking property.
     * 
     */
    public boolean isMarketMaking() {
        return marketMaking;
    }

    /**
     * Sets the value of the marketMaking property.
     * 
     */
    public void setMarketMaking(boolean value) {
        this.marketMaking = value;
    }

    /**
     * Gets the value of the localTraderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTraderId() {
        return localTraderId;
    }

    /**
     * Sets the value of the localTraderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTraderId(String value) {
        this.localTraderId = value;
    }

}
