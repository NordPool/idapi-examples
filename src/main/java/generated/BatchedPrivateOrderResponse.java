
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
 * <p>Java class for BatchedPrivateOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchedPrivateOrderResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="ResponseList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResponseList" type="{}PrivateOrderResponse" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "BatchedPrivateOrderResponse", propOrder = {
    "responseList"
})
@XmlRootElement(name = "BatchedPrivateOrderResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BatchedPrivateOrderResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementWrapper(name = "ResponseList")
    @XmlElement(name = "ResponseList")
    protected List<PrivateOrderResponse> responseList;

    public List<PrivateOrderResponse> getResponseList() {
        if (responseList == null) {
            responseList = new ArrayList<PrivateOrderResponse>();
        }
        return responseList;
    }

    public void setResponseList(List<PrivateOrderResponse> responseList) {
        this.responseList = responseList;
    }

}
