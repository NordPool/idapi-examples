
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
 * <p>Java class for TradeHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeHistoryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="TradeHistoryRows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TradeHistoryRow" type="{}TradeHistoryRow" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "TradeHistoryResponse", propOrder = {
    "tradeHistoryRows"
})
@XmlRootElement(name = "TradeHistoryResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TradeHistoryResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "TradeHistoryRows")
    @XmlElement(name = "TradeHistoryRow")
    protected List<CompanyDto> tradeHistoryRows;

    public List<CompanyDto> getTradeHistoryRows() {
        if (tradeHistoryRows == null) {
            tradeHistoryRows = new ArrayList<CompanyDto>();
        }
        return tradeHistoryRows;
    }

    public void setTradeHistoryRows(List<CompanyDto> tradeHistoryRows) {
        this.tradeHistoryRows = tradeHistoryRows;
    }

}
