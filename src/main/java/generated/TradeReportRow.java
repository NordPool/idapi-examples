
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
 * <p>Java class for TradeReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeReportRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SellOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BuyOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TradeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TradeNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TradeStatus" type="{}TradeStatus" minOccurs="0"/>
 *         &lt;element name="MarketAreaCodeBuy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketAreaCodeSell" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AggressorSide" type="{}OrderAction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportRow", propOrder = {
    "sellOrderId",
    "buyOrderId",
    "productCode",
    "quantity",
    "unitPrice",
    "tradeTime",
    "tradeNumber",
    "tradeStatus",
    "marketAreaCodeBuy",
    "marketAreaCodeSell",
    "displayName",
    "aggressorSide"
})
@XmlSeeAlso({
    BlockTradeReportRow.class
})
@ToString
@EqualsAndHashCode
public class TradeReportRow implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SellOrderId")
    protected long sellOrderId;
    @XmlElement(name = "BuyOrderId")
    protected long buyOrderId;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "Quantity")
    protected long quantity;
    @XmlElement(name = "UnitPrice", required = true)
    protected BigDecimal unitPrice;
    @XmlElement(name = "TradeTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradeTime;
    @XmlElement(name = "TradeNumber")
    protected long tradeNumber;
    @XmlElement(name = "TradeStatus")
    protected TradeStatus tradeStatus;
    @XmlElement(name = "MarketAreaCodeBuy")
    protected String marketAreaCodeBuy;
    @XmlElement(name = "MarketAreaCodeSell")
    protected String marketAreaCodeSell;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "AggressorSide")
    protected OrderAction aggressorSide;

    /**
     * Gets the value of the sellOrderId property.
     * 
     */
    public long getSellOrderId() {
        return sellOrderId;
    }

    /**
     * Sets the value of the sellOrderId property.
     * 
     */
    public void setSellOrderId(long value) {
        this.sellOrderId = value;
    }

    /**
     * Gets the value of the buyOrderId property.
     * 
     */
    public long getBuyOrderId() {
        return buyOrderId;
    }

    /**
     * Sets the value of the buyOrderId property.
     * 
     */
    public void setBuyOrderId(long value) {
        this.buyOrderId = value;
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
     * Gets the value of the tradeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeTime() {
        return tradeTime;
    }

    /**
     * Sets the value of the tradeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeTime(XMLGregorianCalendar value) {
        this.tradeTime = value;
    }

    /**
     * Gets the value of the tradeNumber property.
     * 
     */
    public long getTradeNumber() {
        return tradeNumber;
    }

    /**
     * Sets the value of the tradeNumber property.
     * 
     */
    public void setTradeNumber(long value) {
        this.tradeNumber = value;
    }

    /**
     * Gets the value of the tradeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatus }
     *     
     */
    public TradeStatus getTradeStatus() {
        return tradeStatus;
    }

    /**
     * Sets the value of the tradeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatus }
     *     
     */
    public void setTradeStatus(TradeStatus value) {
        this.tradeStatus = value;
    }

    /**
     * Gets the value of the marketAreaCodeBuy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketAreaCodeBuy() {
        return marketAreaCodeBuy;
    }

    /**
     * Sets the value of the marketAreaCodeBuy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketAreaCodeBuy(String value) {
        this.marketAreaCodeBuy = value;
    }

    /**
     * Gets the value of the marketAreaCodeSell property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketAreaCodeSell() {
        return marketAreaCodeSell;
    }

    /**
     * Sets the value of the marketAreaCodeSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketAreaCodeSell(String value) {
        this.marketAreaCodeSell = value;
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
     * Gets the value of the aggressorSide property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAction }
     *     
     */
    public OrderAction getAggressorSide() {
        return aggressorSide;
    }

    /**
     * Sets the value of the aggressorSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAction }
     *     
     */
    public void setAggressorSide(OrderAction value) {
        this.aggressorSide = value;
    }

}
