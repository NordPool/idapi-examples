
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INACTIVATED"/>
 *     &lt;enumeration value="MATCHED"/>
 *     &lt;enumeration value="VALIDITY_EXPIRED"/>
 *     &lt;enumeration value="OPEN_REMAINING"/>
 *     &lt;enumeration value="CHANGED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="TRADE_CANCELLED"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="MATURED"/>
 *     &lt;enumeration value="FILLED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="ACTIVATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderStatus")
@XmlEnum
public enum OrderStatus {

    INACTIVATED,
    MATCHED,
    VALIDITY_EXPIRED,
    OPEN_REMAINING,
    CHANGED,
    CANCELLED,
    TRADE_CANCELLED,
    OPEN,
    MATURED,
    FILLED,
    EXPIRED,
    ACTIVATED;

    public String value() {
        return name();
    }

    public static OrderStatus fromValue(String v) {
        return valueOf(v);
    }

}
