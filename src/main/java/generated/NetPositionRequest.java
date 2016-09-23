
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
 * <p>Java class for NetPositionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetPositionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{}Request">
 *       &lt;sequence>
 *         &lt;element ref="{}LocalDate"/>
 *         &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MarketAreaCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CrossBorder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FromMarketArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToMarketArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPositionRequest", propOrder = {
    "localDate",
    "portfolioId",
    "marketAreaCodes",
    "crossBorder",
    "fromMarketArea",
    "toMarketArea"
})
@XmlRootElement(name = "NetPositionRequest")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class NetPositionRequest
    extends Request
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocalDate", required = true)
    protected LocalDate localDate;
    @XmlElement(name = "PortfolioId")
    protected Long portfolioId;
    @XmlElementWrapper(name = "MarketAreaCodes")
    @XmlElement(name = "MarketAreaCode")
    protected List<String> marketAreaCodes;
    @XmlElement(name = "CrossBorder")
    protected boolean crossBorder;
    @XmlElement(name = "FromMarketArea")
    protected String fromMarketArea;
    @XmlElement(name = "ToMarketArea")
    protected String toMarketArea;

    /**
     * Gets the value of the localDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDate }
     *     
     */
    public LocalDate getLocalDate() {
        return localDate;
    }

    /**
     * Sets the value of the localDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDate }
     *     
     */
    public void setLocalDate(LocalDate value) {
        this.localDate = value;
    }

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioId(Long value) {
        this.portfolioId = value;
    }

    /**
     * Gets the value of the crossBorder property.
     * 
     */
    public boolean isCrossBorder() {
        return crossBorder;
    }

    /**
     * Sets the value of the crossBorder property.
     * 
     */
    public void setCrossBorder(boolean value) {
        this.crossBorder = value;
    }

    /**
     * Gets the value of the fromMarketArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromMarketArea() {
        return fromMarketArea;
    }

    /**
     * Sets the value of the fromMarketArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromMarketArea(String value) {
        this.fromMarketArea = value;
    }

    /**
     * Gets the value of the toMarketArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToMarketArea() {
        return toMarketArea;
    }

    /**
     * Sets the value of the toMarketArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToMarketArea(String value) {
        this.toMarketArea = value;
    }

    public List<String> getMarketAreaCodes() {
        if (marketAreaCodes == null) {
            marketAreaCodes = new ArrayList<String>();
        }
        return marketAreaCodes;
    }

    public void setMarketAreaCodes(List<String> marketAreaCodes) {
        this.marketAreaCodes = marketAreaCodes;
    }

}
