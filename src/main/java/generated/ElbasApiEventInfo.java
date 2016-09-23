
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for elbasApiEventInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elbasApiEventInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{}defaultEventInfo">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elbasApiEventInfo")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ElbasApiEventInfo
    extends DefaultEventInfo
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
