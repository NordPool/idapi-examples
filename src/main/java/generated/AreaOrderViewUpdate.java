
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
 * <p>Java class for AreaOrderViewUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaOrderViewUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{}PushUpdate">
 *       &lt;sequence>
 *         &lt;element name="AreaOrderReports">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaOrderReport" type="{}OrderReport" maxOccurs="unbounded"/>
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
@XmlType(name = "AreaOrderViewUpdate", propOrder = {
    "areaOrderReports"
})
@XmlRootElement(name = "AreaOrderViewUpdate")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AreaOrderViewUpdate
    extends PushUpdate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "AreaOrderReports", required = true)
    @XmlElement(name = "AreaOrderReport")
    protected List<OrderReport> areaOrderReports;

    public List<OrderReport> getAreaOrderReports() {
        if (areaOrderReports == null) {
            areaOrderReports = new ArrayList<OrderReport>();
        }
        return areaOrderReports;
    }

    public void setAreaOrderReports(List<OrderReport> areaOrderReports) {
        this.areaOrderReports = areaOrderReports;
    }

}
