
package generated;

import java.io.Serializable;
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
 * <p>Java class for PrivateOrderBookRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateOrderBookRow">
 *   &lt;complexContent>
 *     &lt;extension base="{}OrderDepthRow">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OrderType" type="{}OrderType"/>
 *         &lt;element name="ProductDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Validity" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalQty" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreviousOrderNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivateOrderBookRow", propOrder = {
    "userId",
    "portfolioId",
    "orderType",
    "productDisplayName",
    "validity",
    "freeText",
    "originalQty",
    "previousOrderNo",
    "current"
})
@XmlSeeAlso({
    PrivateIcebergOrderBookRow.class,
    PrivateBlockOrderRow.class,
    PrivateMarketMakingOrderBookRow.class
})
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrivateOrderBookRow
    extends OrderDepthRow
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UserId")
    protected long userId;
    @XmlElement(name = "PortfolioId")
    protected long portfolioId;
    @XmlElement(name = "OrderType", required = true)
    protected OrderType orderType;
    @XmlElement(name = "ProductDisplayName", required = true)
    protected String productDisplayName;
    @XmlElement(name = "Validity")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validity;
    @XmlElement(name = "FreeText")
    protected String freeText;
    @XmlElement(name = "OriginalQty")
    protected Long originalQty;
    @XmlElement(name = "PreviousOrderNo")
    protected Long previousOrderNo;
    @XmlElement(name = "Current")
    protected boolean current;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the portfolioId property.
     * 
     */
    public long getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     */
    public void setPortfolioId(long value) {
        this.portfolioId = value;
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
     * Gets the value of the validity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidity() {
        return validity;
    }

    /**
     * Sets the value of the validity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidity(XMLGregorianCalendar value) {
        this.validity = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the originalQty property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOriginalQty() {
        return originalQty;
    }

    /**
     * Sets the value of the originalQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOriginalQty(Long value) {
        this.originalQty = value;
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
     * Gets the value of the current property.
     * 
     */
    public boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     */
    public void setCurrent(boolean value) {
        this.current = value;
    }

}
