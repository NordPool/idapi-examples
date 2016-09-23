
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Buy"/>
 *     &lt;enumeration value="Sell"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderAction")
@XmlEnum
public enum OrderAction {

    @XmlEnumValue("Buy")
    BUY("Buy"),
    @XmlEnumValue("Sell")
    SELL("Sell");
    private final String value;

    OrderAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderAction fromValue(String v) {
        for (OrderAction c: OrderAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
