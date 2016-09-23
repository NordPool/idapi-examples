
package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseErrorCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseErrorCodes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="P01"/>
 *     &lt;enumeration value="M01"/>
 *     &lt;enumeration value="CV02"/>
 *     &lt;enumeration value="E02"/>
 *     &lt;enumeration value="O05"/>
 *     &lt;enumeration value="O03"/>
 *     &lt;enumeration value="T03"/>
 *     &lt;enumeration value="O11"/>
 *     &lt;enumeration value="MM03"/>
 *     &lt;enumeration value="O13"/>
 *     &lt;enumeration value="O01"/>
 *     &lt;enumeration value="O12"/>
 *     &lt;enumeration value="E03"/>
 *     &lt;enumeration value="O10"/>
 *     &lt;enumeration value="A01"/>
 *     &lt;enumeration value="O09"/>
 *     &lt;enumeration value="T05"/>
 *     &lt;enumeration value="CV01"/>
 *     &lt;enumeration value="M03"/>
 *     &lt;enumeration value="MM02"/>
 *     &lt;enumeration value="E01"/>
 *     &lt;enumeration value="E04"/>
 *     &lt;enumeration value="O02"/>
 *     &lt;enumeration value="O04"/>
 *     &lt;enumeration value="T09"/>
 *     &lt;enumeration value="P03"/>
 *     &lt;enumeration value="T04"/>
 *     &lt;enumeration value="O07"/>
 *     &lt;enumeration value="C01"/>
 *     &lt;enumeration value="O08"/>
 *     &lt;enumeration value="PQ02"/>
 *     &lt;enumeration value="C02"/>
 *     &lt;enumeration value="M02"/>
 *     &lt;enumeration value="E05"/>
 *     &lt;enumeration value="MM01"/>
 *     &lt;enumeration value="T02"/>
 *     &lt;enumeration value="T07"/>
 *     &lt;enumeration value="O06"/>
 *     &lt;enumeration value="A02"/>
 *     &lt;enumeration value="P02"/>
 *     &lt;enumeration value="A03"/>
 *     &lt;enumeration value="T06"/>
 *     &lt;enumeration value="T01"/>
 *     &lt;enumeration value="T08"/>
 *     &lt;enumeration value="PQ01"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseErrorCodes")
@XmlEnum
public enum ResponseErrorCodes {

    @XmlEnumValue("P01")
    P_01("P01"),
    @XmlEnumValue("M01")
    M_01("M01"),
    @XmlEnumValue("CV02")
    CV_02("CV02"),
    @XmlEnumValue("E02")
    E_02("E02"),
    @XmlEnumValue("O05")
    O_05("O05"),
    @XmlEnumValue("O03")
    O_03("O03"),
    @XmlEnumValue("T03")
    T_03("T03"),
    @XmlEnumValue("O11")
    O_11("O11"),
    @XmlEnumValue("MM03")
    MM_03("MM03"),
    @XmlEnumValue("O13")
    O_13("O13"),
    @XmlEnumValue("O01")
    O_01("O01"),
    @XmlEnumValue("O12")
    O_12("O12"),
    @XmlEnumValue("E03")
    E_03("E03"),
    @XmlEnumValue("O10")
    O_10("O10"),
    @XmlEnumValue("A01")
    A_01("A01"),
    @XmlEnumValue("O09")
    O_09("O09"),
    @XmlEnumValue("T05")
    T_05("T05"),
    @XmlEnumValue("CV01")
    CV_01("CV01"),
    @XmlEnumValue("M03")
    M_03("M03"),
    @XmlEnumValue("MM02")
    MM_02("MM02"),
    @XmlEnumValue("E01")
    E_01("E01"),
    @XmlEnumValue("E04")
    E_04("E04"),
    @XmlEnumValue("O02")
    O_02("O02"),
    @XmlEnumValue("O04")
    O_04("O04"),
    @XmlEnumValue("T09")
    T_09("T09"),
    @XmlEnumValue("P03")
    P_03("P03"),
    @XmlEnumValue("T04")
    T_04("T04"),
    @XmlEnumValue("O07")
    O_07("O07"),
    @XmlEnumValue("C01")
    C_01("C01"),
    @XmlEnumValue("O08")
    O_08("O08"),
    @XmlEnumValue("PQ02")
    PQ_02("PQ02"),
    @XmlEnumValue("C02")
    C_02("C02"),
    @XmlEnumValue("M02")
    M_02("M02"),
    @XmlEnumValue("E05")
    E_05("E05"),
    @XmlEnumValue("MM01")
    MM_01("MM01"),
    @XmlEnumValue("T02")
    T_02("T02"),
    @XmlEnumValue("T07")
    T_07("T07"),
    @XmlEnumValue("O06")
    O_06("O06"),
    @XmlEnumValue("A02")
    A_02("A02"),
    @XmlEnumValue("P02")
    P_02("P02"),
    @XmlEnumValue("A03")
    A_03("A03"),
    @XmlEnumValue("T06")
    T_06("T06"),
    @XmlEnumValue("T01")
    T_01("T01"),
    @XmlEnumValue("T08")
    T_08("T08"),
    @XmlEnumValue("PQ01")
    PQ_01("PQ01");
    private final String value;

    ResponseErrorCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseErrorCodes fromValue(String v) {
        for (ResponseErrorCodes c: ResponseErrorCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
