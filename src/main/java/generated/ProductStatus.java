
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLOSED"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="FROZEN"/>
 *     &lt;enumeration value="OPEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductStatus")
@XmlEnum
public enum ProductStatus {

    CLOSED,
    NEW,
    EXPIRED,
    FROZEN,
    OPEN;

    public String value() {
        return name();
    }

    public static ProductStatus fromValue(String v) {
        return valueOf(v);
    }

}
