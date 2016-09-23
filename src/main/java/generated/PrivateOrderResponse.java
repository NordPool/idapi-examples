
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
 * <p>Java class for PrivateOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivateOrderResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="PortfolioId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UpdatedOrders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UpdatedOrder" type="{}PrivateOrderBookRow" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RemovedOrders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RemovedOrder" type="{}PrivateOrderBookRow" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PrivateOrderResponse", propOrder = {
    "portfolioId",
    "updatedOrders",
    "removedOrders"
})
@XmlRootElement(name = "PrivateOrderResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PrivateOrderResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PortfolioId")
    protected Long portfolioId;
    @XmlElementWrapper(name = "UpdatedOrders")
    @XmlElement(name = "UpdatedOrder")
    protected List<PrivateOrderBookRow> updatedOrders;
    @XmlElementWrapper(name = "RemovedOrders")
    @XmlElement(name = "RemovedOrder")
    protected List<PrivateOrderBookRow> removedOrders;

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPortfolioId(Long value) {
        this.portfolioId = value;
    }

    public List<PrivateOrderBookRow> getUpdatedOrders() {
        if (updatedOrders == null) {
            updatedOrders = new ArrayList<PrivateOrderBookRow>();
        }
        return updatedOrders;
    }

    public void setUpdatedOrders(List<PrivateOrderBookRow> updatedOrders) {
        this.updatedOrders = updatedOrders;
    }

    public List<PrivateOrderBookRow> getRemovedOrders() {
        if (removedOrders == null) {
            removedOrders = new ArrayList<PrivateOrderBookRow>();
        }
        return removedOrders;
    }

    public void setRemovedOrders(List<PrivateOrderBookRow> removedOrders) {
        this.removedOrders = removedOrders;
    }

}
