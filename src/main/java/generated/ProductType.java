
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UK_DOP"/>
 *     &lt;enumeration value="UK_DEP"/>
 *     &lt;enumeration value="UK_DP"/>
 *     &lt;enumeration value="P60MIN"/>
 *     &lt;enumeration value="UK_2H_BLOCK"/>
 *     &lt;enumeration value="UK_DB34"/>
 *     &lt;enumeration value="UK_DB"/>
 *     &lt;enumeration value="UK_DON"/>
 *     &lt;enumeration value="P30MIN"/>
 *     &lt;enumeration value="P15MIN"/>
 *     &lt;enumeration value="UK_4H_BLOCK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductType")
@XmlEnum
public enum ProductType {

    UK_DOP("UK_DOP"),
    UK_DEP("UK_DEP"),
    UK_DP("UK_DP"),
    @XmlEnumValue("P60MIN")
    P_60_MIN("P60MIN"),
    @XmlEnumValue("UK_2H_BLOCK")
    UK_2_H_BLOCK("UK_2H_BLOCK"),
    @XmlEnumValue("UK_DB34")
    UK_DB_34("UK_DB34"),
    UK_DB("UK_DB"),
    UK_DON("UK_DON"),
    @XmlEnumValue("P30MIN")
    P_30_MIN("P30MIN"),
    @XmlEnumValue("P15MIN")
    P_15_MIN("P15MIN"),
    @XmlEnumValue("UK_4H_BLOCK")
    UK_4_H_BLOCK("UK_4H_BLOCK");
    private final String value;

    ProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductType fromValue(String v) {
        for (ProductType c: ProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
