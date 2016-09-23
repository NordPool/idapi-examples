
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
 * <p>Java class for AddOrUpdateUserSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOrUpdateUserSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{}Request">
 *       &lt;sequence>
 *         &lt;element ref="{}UserSettings" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOrUpdateUserSettings", propOrder = {
    "userSettings"
})
@XmlRootElement(name = "AddOrUpdateUserSettings")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AddOrUpdateUserSettings
    extends Request
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UserSettings")
    protected List<UserSettings> userSettings;

    /**
     * Gets the value of the userSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserSettings }
     * 
     * 
     */
    public List<UserSettings> getUserSettings() {
        if (userSettings == null) {
            userSettings = new ArrayList<UserSettings>();
        }
        return this.userSettings;
    }

}
