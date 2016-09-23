
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
 * <p>Java class for UserSettingsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSettingsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="UserSettings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserSetting" type="{}UserSettingsDto" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UserSettingsResponse", propOrder = {
    "userSettings"
})
@XmlRootElement(name = "UserSettingsResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserSettingsResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "UserSettings")
    @XmlElement(name = "UserSetting")
    protected List<UserSettings> userSettings;

    public List<UserSettings> getUserSettings() {
        if (userSettings == null) {
            userSettings = new ArrayList<UserSettings>();
        }
        return userSettings;
    }

    public void setUserSettings(List<UserSettings> userSettings) {
        this.userSettings = userSettings;
    }

}
