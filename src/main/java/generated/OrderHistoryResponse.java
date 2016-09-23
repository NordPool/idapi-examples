
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
 * <p>Java class for OrderHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHistoryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="OrderHistoryRows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}OrderHistoryRow" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "OrderHistoryResponse", propOrder = {
    "orderHistoryRows"
})
@XmlRootElement(name = "OrderHistoryResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class OrderHistoryResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "OrderHistoryRows")
    @XmlElement(name = "OrderHistoryRow")
    protected List<OrderHistoryRow> orderHistoryRows;

    public List<OrderHistoryRow> getOrderHistoryRows() {
        if (orderHistoryRows == null) {
            orderHistoryRows = new ArrayList<OrderHistoryRow>();
        }
        return orderHistoryRows;
    }

    public void setOrderHistoryRows(List<OrderHistoryRow> orderHistoryRows) {
        this.orderHistoryRows = orderHistoryRows;
    }

}
