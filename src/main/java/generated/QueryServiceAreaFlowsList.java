
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
 * <p>Java class for QueryServiceAreaFlowsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryServiceAreaFlowsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FromArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEventNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Flows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Flows" type="{}NetPositions" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tradeIdList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryServiceAreaFlowsList", propOrder = {
    "fromArea",
    "toArea",
    "lastEventNo",
    "unit",
    "resolution",
    "flows",
    "tradeIdLists"
})
@XmlRootElement(name = "QueryServiceAreaFlowsList")
@ToString
@EqualsAndHashCode
public class QueryServiceAreaFlowsList implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FromArea")
    protected String fromArea;
    @XmlElement(name = "ToArea")
    protected String toArea;
    @XmlElement(name = "LastEventNo")
    protected Long lastEventNo;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElementWrapper(name = "Flows")
    @XmlElement(name = "Flows")
    protected List<NetPositions> flows;
    @XmlElement(name = "tradeIdList", nillable = true)
    protected List<Long> tradeIdLists;

    /**
     * Gets the value of the fromArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromArea() {
        return fromArea;
    }

    /**
     * Sets the value of the fromArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromArea(String value) {
        this.fromArea = value;
    }

    /**
     * Gets the value of the toArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToArea() {
        return toArea;
    }

    /**
     * Sets the value of the toArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToArea(String value) {
        this.toArea = value;
    }

    /**
     * Gets the value of the lastEventNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastEventNo() {
        return lastEventNo;
    }

    /**
     * Sets the value of the lastEventNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastEventNo(Long value) {
        this.lastEventNo = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the tradeIdLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTradeIdLists() {
        if (tradeIdLists == null) {
            tradeIdLists = new ArrayList<Long>();
        }
        return this.tradeIdLists;
    }

    public List<NetPositions> getFlows() {
        if (flows == null) {
            flows = new ArrayList<NetPositions>();
        }
        return flows;
    }

    public void setFlows(List<NetPositions> flows) {
        this.flows = flows;
    }

}
