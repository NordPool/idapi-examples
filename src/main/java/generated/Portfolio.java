
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
 * <p>Java class for PortfolioDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MarketAreaCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BalancingGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortfolioCompanyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PortfolioCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WriteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioDto", propOrder = {
    "portfolioId",
    "name",
    "marketAreaCodes",
    "balancingGroupName",
    "portfolioCompanyId",
    "portfolioCompanyCode",
    "writeAccess"
})
@XmlRootElement(name = "Portfolio")
@ToString
@EqualsAndHashCode
public class Portfolio implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PortfolioId")
    protected long portfolioId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementWrapper(name = "MarketAreaCodes")
    @XmlElement(name = "MarketAreaCode")
    protected List<String> marketAreaCodes;
    @XmlElement(name = "BalancingGroupName")
    protected String balancingGroupName;
    @XmlElement(name = "PortfolioCompanyId")
    protected long portfolioCompanyId;
    @XmlElement(name = "PortfolioCompanyCode", required = true)
    protected String portfolioCompanyCode;
    @XmlElement(name = "WriteAccess")
    protected boolean writeAccess;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the balancingGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalancingGroupName() {
        return balancingGroupName;
    }

    /**
     * Sets the value of the balancingGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalancingGroupName(String value) {
        this.balancingGroupName = value;
    }

    /**
     * Gets the value of the portfolioCompanyId property.
     * 
     */
    public long getPortfolioCompanyId() {
        return portfolioCompanyId;
    }

    /**
     * Sets the value of the portfolioCompanyId property.
     * 
     */
    public void setPortfolioCompanyId(long value) {
        this.portfolioCompanyId = value;
    }

    /**
     * Gets the value of the portfolioCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioCompanyCode() {
        return portfolioCompanyCode;
    }

    /**
     * Sets the value of the portfolioCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioCompanyCode(String value) {
        this.portfolioCompanyCode = value;
    }

    /**
     * Gets the value of the writeAccess property.
     * 
     */
    public boolean isWriteAccess() {
        return writeAccess;
    }

    /**
     * Sets the value of the writeAccess property.
     * 
     */
    public void setWriteAccess(boolean value) {
        this.writeAccess = value;
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
