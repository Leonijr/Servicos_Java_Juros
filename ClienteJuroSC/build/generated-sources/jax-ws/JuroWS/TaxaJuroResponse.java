
package JuroWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de TaxaJuroResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TaxaJuroResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respotaTJ" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxaJuroResponse", propOrder = {
    "respotaTJ"
})
public class TaxaJuroResponse {

    protected float respotaTJ;

    /**
     * Obtém o valor da propriedade respotaTJ.
     * 
     */
    public float getRespotaTJ() {
        return respotaTJ;
    }

    /**
     * Define o valor da propriedade respotaTJ.
     * 
     */
    public void setRespotaTJ(float value) {
        this.respotaTJ = value;
    }

}
