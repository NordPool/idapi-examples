
package generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * <p>Java class for BlockTradeReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockTradeReportRow">
 *   &lt;complexContent>
 *     &lt;extension base="{}TradeReportRow">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockTradeReportRow")
@XmlRootElement(name = "BlockTradeReportRow")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BlockTradeReportRow
    extends TradeReportRow
    implements Serializable
{

    private final static long serialVersionUID = 1L;

}
