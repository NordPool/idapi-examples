
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IBO"/>
 *     &lt;enumeration value="LIMIT"/>
 *     &lt;enumeration value="IOC"/>
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="FOK"/>
 *     &lt;enumeration value="MM_LIMIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderType")
@XmlEnum
public enum OrderType {

    IBO,
    LIMIT,
    IOC,
    BLOCK,
    FOK,
    MM_LIMIT;

    public String value() {
        return name();
    }

    public static OrderType fromValue(String v) {
        return valueOf(v);
    }

}
