
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
 * <p>Java class for AreaConnectionDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaConnectionDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaConnId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Area1" type="{}MarketAreaDto"/>
 *         &lt;element name="Area2" type="{}MarketAreaDto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaConnectionDto", propOrder = {
    "areaConnId",
    "area1",
    "area2"
})
@XmlRootElement(name = "AreaConnection")
@ToString
@EqualsAndHashCode
public class AreaConnection implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AreaConnId")
    protected long areaConnId;
    @XmlElement(name = "Area1", required = true)
    protected MarketArea area1;
    @XmlElement(name = "Area2", required = true)
    protected MarketArea area2;

    /**
     * Gets the value of the areaConnId property.
     * 
     */
    public long getAreaConnId() {
        return areaConnId;
    }

    /**
     * Sets the value of the areaConnId property.
     * 
     */
    public void setAreaConnId(long value) {
        this.areaConnId = value;
    }

    /**
     * Gets the value of the area1 property.
     * 
     * @return
     *     possible object is
     *     {@link MarketArea }
     *     
     */
    public MarketArea getArea1() {
        return area1;
    }

    /**
     * Sets the value of the area1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketArea }
     *     
     */
    public void setArea1(MarketArea value) {
        this.area1 = value;
    }

    /**
     * Gets the value of the area2 property.
     * 
     * @return
     *     possible object is
     *     {@link MarketArea }
     *     
     */
    public MarketArea getArea2() {
        return area2;
    }

    /**
     * Sets the value of the area2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketArea }
     *     
     */
    public void setArea2(MarketArea value) {
        this.area2 = value;
    }

}
