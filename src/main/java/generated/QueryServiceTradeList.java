
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
 * <p>Java class for QueryServiceTradeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryServiceTradeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryServiceTradeListRows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QueryServiceTradeListRow" type="{}queryServiceTradeListRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryServiceTradeList", propOrder = {
    "queryServiceTradeListRows"
})
@XmlRootElement(name = "QueryServiceTradeList")
@ToString
@EqualsAndHashCode
public class QueryServiceTradeList implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "QueryServiceTradeListRows")
    @XmlElement(name = "QueryServiceTradeListRow")
    protected List<QueryServiceTradeListRow> queryServiceTradeListRows;

    public List<QueryServiceTradeListRow> getQueryServiceTradeListRows() {
        if (queryServiceTradeListRows == null) {
            queryServiceTradeListRows = new ArrayList<QueryServiceTradeListRow>();
        }
        return queryServiceTradeListRows;
    }

    public void setQueryServiceTradeListRows(List<QueryServiceTradeListRow> queryServiceTradeListRows) {
        this.queryServiceTradeListRows = queryServiceTradeListRows;
    }

}
