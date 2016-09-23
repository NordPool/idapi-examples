
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
 * <p>Java class for OrderReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaBlockOrdersAdded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaBlockOrderAdded" type="{}BlockOrderDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaBlockOrdersDeleted" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaBlockOrderDeleted" type="{}BlockOrderDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaOrdersDepthAdded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaOrderDepthAdded" type="{}OrderDepthRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AreaOrdersDepthDeleted" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AreaOrderDepthDeleted" type="{}OrderDepthRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReport", propOrder = {
    "areaCode",
    "areaBlockOrdersAdded",
    "areaBlockOrdersDeleted",
    "areaOrdersDepthAdded",
    "areaOrdersDepthDeleted"
})
@XmlRootElement(name = "OrderReport")
@ToString
@EqualsAndHashCode
public class OrderReport implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AreaCode", required = true)
    protected String areaCode;
    @XmlElementWrapper(name = "AreaBlockOrdersAdded")
    @XmlElement(name = "AreaBlockOrderAdded")
    protected List<BlockOrder> areaBlockOrdersAdded;
    @XmlElementWrapper(name = "AreaBlockOrdersDeleted")
    @XmlElement(name = "AreaBlockOrderDeleted")
    protected List<BlockOrder> areaBlockOrdersDeleted;
    @XmlElementWrapper(name = "AreaOrdersDepthAdded")
    @XmlElement(name = "AreaOrderDepthAdded")
    protected List<OrderDepthRow> areaOrdersDepthAdded;
    @XmlElementWrapper(name = "AreaOrdersDepthDeleted")
    @XmlElement(name = "AreaOrderDepthDeleted")
    protected List<OrderDepthRow> areaOrdersDepthDeleted;

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    public List<BlockOrder> getAreaBlockOrdersAdded() {
        if (areaBlockOrdersAdded == null) {
            areaBlockOrdersAdded = new ArrayList<BlockOrder>();
        }
        return areaBlockOrdersAdded;
    }

    public void setAreaBlockOrdersAdded(List<BlockOrder> areaBlockOrdersAdded) {
        this.areaBlockOrdersAdded = areaBlockOrdersAdded;
    }

    public List<BlockOrder> getAreaBlockOrdersDeleted() {
        if (areaBlockOrdersDeleted == null) {
            areaBlockOrdersDeleted = new ArrayList<BlockOrder>();
        }
        return areaBlockOrdersDeleted;
    }

    public void setAreaBlockOrdersDeleted(List<BlockOrder> areaBlockOrdersDeleted) {
        this.areaBlockOrdersDeleted = areaBlockOrdersDeleted;
    }

    public List<OrderDepthRow> getAreaOrdersDepthAdded() {
        if (areaOrdersDepthAdded == null) {
            areaOrdersDepthAdded = new ArrayList<OrderDepthRow>();
        }
        return areaOrdersDepthAdded;
    }

    public void setAreaOrdersDepthAdded(List<OrderDepthRow> areaOrdersDepthAdded) {
        this.areaOrdersDepthAdded = areaOrdersDepthAdded;
    }

    public List<OrderDepthRow> getAreaOrdersDepthDeleted() {
        if (areaOrdersDepthDeleted == null) {
            areaOrdersDepthDeleted = new ArrayList<OrderDepthRow>();
        }
        return areaOrdersDepthDeleted;
    }

    public void setAreaOrdersDepthDeleted(List<OrderDepthRow> areaOrdersDepthDeleted) {
        this.areaOrdersDepthDeleted = areaOrdersDepthDeleted;
    }

}
