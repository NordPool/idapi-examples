
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
 * <p>Java class for h2HReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="h2HReportRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="f" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mf" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="xb" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="t" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="p" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fps" type="{}ProductStatus"/>
 *         &lt;element name="tps" type="{}ProductStatus"/>
 *         &lt;element name="isf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "h2HReportRow", propOrder = {
    "f",
    "mf",
    "xb",
    "t",
    "p",
    "d",
    "fps",
    "tps",
    "isf"
})
@XmlRootElement(name = "H2hr")
@ToString
@EqualsAndHashCode
public class H2Hr implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String f;
    protected long mf;
    protected long xb;
    @XmlElement(required = true)
    protected String t;
    @XmlElement(required = true)
    protected String p;
    @XmlElement(required = true)
    protected String d;
    @XmlElement(required = true)
    protected ProductStatus fps;
    @XmlElement(required = true)
    protected ProductStatus tps;
    protected boolean isf;

    /**
     * Gets the value of the f property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF(String value) {
        this.f = value;
    }

    /**
     * Gets the value of the mf property.
     * 
     */
    public long getMf() {
        return mf;
    }

    /**
     * Sets the value of the mf property.
     * 
     */
    public void setMf(long value) {
        this.mf = value;
    }

    /**
     * Gets the value of the xb property.
     * 
     */
    public long getXb() {
        return xb;
    }

    /**
     * Sets the value of the xb property.
     * 
     */
    public void setXb(long value) {
        this.xb = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT(String value) {
        this.t = value;
    }

    /**
     * Gets the value of the p property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getP() {
        return p;
    }

    /**
     * Sets the value of the p property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setP(String value) {
        this.p = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD(String value) {
        this.d = value;
    }

    /**
     * Gets the value of the fps property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getFps() {
        return fps;
    }

    /**
     * Sets the value of the fps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setFps(ProductStatus value) {
        this.fps = value;
    }

    /**
     * Gets the value of the tps property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatus }
     *     
     */
    public ProductStatus getTps() {
        return tps;
    }

    /**
     * Sets the value of the tps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatus }
     *     
     */
    public void setTps(ProductStatus value) {
        this.tps = value;
    }

    /**
     * Gets the value of the isf property.
     * 
     */
    public boolean isIsf() {
        return isf;
    }

    /**
     * Sets the value of the isf property.
     * 
     */
    public void setIsf(boolean value) {
        this.isf = value;
    }

}
