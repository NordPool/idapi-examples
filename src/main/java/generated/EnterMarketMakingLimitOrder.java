
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
 * <p>Java class for EnterMarketMakingLimitOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnterMarketMakingLimitOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{}EnterLimitOrder">
 *       &lt;sequence>
 *         &lt;element name="OrderNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterMarketMakingLimitOrder", propOrder = {
    "orderNo"
})
@XmlRootElement(name = "EnterMarketMakingLimitOrder")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class EnterMarketMakingLimitOrder
    extends EnterLimitOrder
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OrderNo")
    protected Long orderNo;

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderNo(Long value) {
        this.orderNo = value;
    }

}
