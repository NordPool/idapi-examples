
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
 * <p>Java class for InitialRefreshResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialRefreshResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="AreaOrderReports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaOrderReport" type="{}OrderReport" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TradeReports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TradeReport" type="{}TradeReportRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HubToHubCapacities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="h2hc" type="{}h2HReportRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OwnAndPortfolioOrders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OwnAndPortfolioOrder" type="{}PrivateOrderBookRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Products" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Product" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaConnections" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}AreaConnection" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketAreas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}MarketArea" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketMessages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}MarketMessage" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialRefreshResponse", propOrder = {
    "areaOrderReports",
    "tradeReports",
    "hubToHubCapacities",
    "ownAndPortfolioOrders",
    "products",
    "areaConnections",
    "marketAreas",
    "marketMessages"
})
@XmlRootElement(name = "InitialRefreshResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class InitialRefreshResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "AreaOrderReports")
    @XmlElement(name = "AreaOrderReport")
    protected List<OrderReport> areaOrderReports;
    @XmlElementWrapper(name = "TradeReports")
    @XmlElement(name = "TradeReport")
    protected List<TradeReportRow> tradeReports;
    @XmlElementWrapper(name = "HubToHubCapacities")
    @XmlElement(name = "h2hc")
    protected List<H2Hr> hubToHubCapacities;
    @XmlElementWrapper(name = "OwnAndPortfolioOrders")
    @XmlElement(name = "OwnAndPortfolioOrder")
    protected List<PrivateOrderBookRow> ownAndPortfolioOrders;
    @XmlElementWrapper(name = "Products")
    @XmlElement(name = "Product")
    protected List<Product> products;
    @XmlElementWrapper(name = "AreaConnections")
    @XmlElement(name = "AreaConnection")
    protected List<AreaConnection> areaConnections;
    @XmlElementWrapper(name = "MarketAreas")
    @XmlElement(name = "MarketArea")
    protected List<MarketArea> marketAreas;
    @XmlElementWrapper(name = "MarketMessages")
    @XmlElement(name = "MarketMessage")
    protected List<MarketMessage> marketMessages;

    public List<OrderReport> getAreaOrderReports() {
        if (areaOrderReports == null) {
            areaOrderReports = new ArrayList<OrderReport>();
        }
        return areaOrderReports;
    }

    public void setAreaOrderReports(List<OrderReport> areaOrderReports) {
        this.areaOrderReports = areaOrderReports;
    }

    public List<TradeReportRow> getTradeReports() {
        if (tradeReports == null) {
            tradeReports = new ArrayList<TradeReportRow>();
        }
        return tradeReports;
    }

    public void setTradeReports(List<TradeReportRow> tradeReports) {
        this.tradeReports = tradeReports;
    }

    public List<H2Hr> getHubToHubCapacities() {
        if (hubToHubCapacities == null) {
            hubToHubCapacities = new ArrayList<H2Hr>();
        }
        return hubToHubCapacities;
    }

    public void setHubToHubCapacities(List<H2Hr> hubToHubCapacities) {
        this.hubToHubCapacities = hubToHubCapacities;
    }

    public List<PrivateOrderBookRow> getOwnAndPortfolioOrders() {
        if (ownAndPortfolioOrders == null) {
            ownAndPortfolioOrders = new ArrayList<PrivateOrderBookRow>();
        }
        return ownAndPortfolioOrders;
    }

    public void setOwnAndPortfolioOrders(List<PrivateOrderBookRow> ownAndPortfolioOrders) {
        this.ownAndPortfolioOrders = ownAndPortfolioOrders;
    }

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<Product>();
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<AreaConnection> getAreaConnections() {
        if (areaConnections == null) {
            areaConnections = new ArrayList<AreaConnection>();
        }
        return areaConnections;
    }

    public void setAreaConnections(List<AreaConnection> areaConnections) {
        this.areaConnections = areaConnections;
    }

    public List<MarketArea> getMarketAreas() {
        if (marketAreas == null) {
            marketAreas = new ArrayList<MarketArea>();
        }
        return marketAreas;
    }

    public void setMarketAreas(List<MarketArea> marketAreas) {
        this.marketAreas = marketAreas;
    }

    public List<MarketMessage> getMarketMessages() {
        if (marketMessages == null) {
            marketMessages = new ArrayList<MarketMessage>();
        }
        return marketMessages;
    }

    public void setMarketMessages(List<MarketMessage> marketMessages) {
        this.marketMessages = marketMessages;
    }

}
