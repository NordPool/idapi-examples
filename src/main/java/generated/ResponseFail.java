
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for ResponseFail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseFail">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{}ResponseErrorCodes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseFail", propOrder = {
    "errorCode"
})
@XmlRootElement(name = "ResponseFail")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ResponseFail
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ErrorCode", required = true)
    protected ResponseErrorCodes errorCode;

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseErrorCodes }
     *     
     */
    public ResponseErrorCodes getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseErrorCodes }
     *     
     */
    public void setErrorCode(ResponseErrorCodes value) {
        this.errorCode = value;
    }

}
