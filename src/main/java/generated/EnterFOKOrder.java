
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for EnterFOKOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnterFOKOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{}EnterLimitOrder">
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
@XmlType(name = "EnterFOKOrder")
@XmlRootElement(name = "EnterFOKOrder")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnterFOKOrder
    extends EnterLimitOrder
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
