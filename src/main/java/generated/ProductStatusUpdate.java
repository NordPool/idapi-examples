
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
 * <p>Java class for ProductStatusUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductStatusUpdate">
 *   &lt;complexContent>
 *     &lt;extension base="{}PushUpdate">
 *       &lt;sequence>
 *         &lt;element name="Products" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Product" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ProductStatusUpdate", propOrder = {
    "products"
})
@XmlRootElement(name = "ProductStatusUpdate")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ProductStatusUpdate
    extends PushUpdate
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "Products")
    @XmlElement(name = "Product")
    protected List<Product> products;

    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<Product>();
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
