
package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for PublicHubToHubUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicHubToHubUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{}PushUpdate">
 *       &lt;sequence>
 *         &lt;element ref="{}H2hr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicHubToHubUpdate", propOrder = {
    "h2Hrs"
})
@XmlRootElement(name = "PublicHubToHubUpdate")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PublicHubToHubUpdate
    extends PushUpdate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "H2hr")
    protected List<H2Hr> h2Hrs;

    /**
     * Gets the value of the h2Hrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the h2Hrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getH2Hrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H2Hr }
     * 
     * 
     */
    public List<H2Hr> getH2Hrs() {
        if (h2Hrs == null) {
            h2Hrs = new ArrayList<H2Hr>();
        }
        return this.h2Hrs;
    }

}
