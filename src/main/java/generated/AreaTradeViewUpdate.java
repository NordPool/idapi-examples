
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
 * <p>Java class for AreaTradeViewUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaTradeViewUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{}PushUpdate">
 *       &lt;sequence>
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
 *         &lt;element name="MarketAreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaTradeViewUpdate", propOrder = {
    "tradeReports",
    "marketAreaCode"
})
@XmlRootElement(name = "AreaTradeViewUpdate")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AreaTradeViewUpdate
    extends PushUpdate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "TradeReports")
    @XmlElement(name = "TradeReport")
    protected List<TradeReportRow> tradeReports;
    @XmlElement(name = "MarketAreaCode", required = true)
    protected String marketAreaCode;

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

    public List<TradeReportRow> getTradeReports() {
        if (tradeReports == null) {
            tradeReports = new ArrayList<TradeReportRow>();
        }
        return tradeReports;
    }

    public void setTradeReports(List<TradeReportRow> tradeReports) {
        this.tradeReports = tradeReports;
    }

}
