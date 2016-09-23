
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for InitialRefreshRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialRefreshRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{}Request">
 *       &lt;sequence>
 *         &lt;element name="lightRefreshRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialRefreshRequest", propOrder = {
    "lightRefreshRequest"
})
@XmlRootElement(name = "InitialRefreshRequest")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class InitialRefreshRequest
    extends Request
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean lightRefreshRequest;

    /**
     * Gets the value of the lightRefreshRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLightRefreshRequest() {
        return lightRefreshRequest;
    }

    /**
     * Sets the value of the lightRefreshRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLightRefreshRequest(Boolean value) {
        this.lightRefreshRequest = value;
    }

}
