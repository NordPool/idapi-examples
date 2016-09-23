
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
 * <p>Java class for UserDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDataResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{}Response">
 *       &lt;sequence>
 *         &lt;element name="CurrentUser" type="{}CompanyUserDto"/>
 *         &lt;element name="CurrentCompany" type="{}CompanyDto"/>
 *         &lt;element name="Portfolios" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Portfolio" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CompanyUserCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyUserCode" type="{}UserCodeDto" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HeartbeatFrequency" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDataResponse", propOrder = {
    "currentUser",
    "currentCompany",
    "portfolios",
    "companyUserCodes",
    "heartbeatFrequency",
    "sessionTimeout"
})
@XmlRootElement(name = "UserDataResponse")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UserDataResponse
    extends Response
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CurrentUser", required = true)
    protected CompanyUser currentUser;
    @XmlElement(name = "CurrentCompany", required = true)
    protected Company currentCompany;
    @XmlElementWrapper(name = "Portfolios")
    @XmlElement(name = "Portfolio")
    protected List<Portfolio> portfolios;
    @XmlElementWrapper(name = "CompanyUserCodes")
    @XmlElement(name = "CompanyUserCode")
    protected List<UserCode> companyUserCodes;
    @XmlElement(name = "HeartbeatFrequency")
    protected long heartbeatFrequency;
    @XmlElement(name = "SessionTimeout")
    protected long sessionTimeout;

    /**
     * Gets the value of the currentUser property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyUser }
     *     
     */
    public CompanyUser getCurrentUser() {
        return currentUser;
    }

    /**
     * Sets the value of the currentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyUser }
     *     
     */
    public void setCurrentUser(CompanyUser value) {
        this.currentUser = value;
    }

    /**
     * Gets the value of the currentCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCurrentCompany() {
        return currentCompany;
    }

    /**
     * Sets the value of the currentCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCurrentCompany(Company value) {
        this.currentCompany = value;
    }

    /**
     * Gets the value of the heartbeatFrequency property.
     * 
     */
    public long getHeartbeatFrequency() {
        return heartbeatFrequency;
    }

    /**
     * Sets the value of the heartbeatFrequency property.
     * 
     */
    public void setHeartbeatFrequency(long value) {
        this.heartbeatFrequency = value;
    }

    /**
     * Gets the value of the sessionTimeout property.
     * 
     */
    public long getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Sets the value of the sessionTimeout property.
     * 
     */
    public void setSessionTimeout(long value) {
        this.sessionTimeout = value;
    }

    public List<Portfolio> getPortfolios() {
        if (portfolios == null) {
            portfolios = new ArrayList<Portfolio>();
        }
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public List<UserCode> getCompanyUserCodes() {
        if (companyUserCodes == null) {
            companyUserCodes = new ArrayList<UserCode>();
        }
        return companyUserCodes;
    }

    public void setCompanyUserCodes(List<UserCode> companyUserCodes) {
        this.companyUserCodes = companyUserCodes;
    }

}
