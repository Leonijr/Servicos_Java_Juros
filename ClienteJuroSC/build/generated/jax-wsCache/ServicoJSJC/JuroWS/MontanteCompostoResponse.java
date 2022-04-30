
package JuroWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MontanteCompostoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MontanteCompostoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respotaMC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MontanteCompostoResponse", propOrder = {
    "respotaMC"
})
public class MontanteCompostoResponse {

    protected float respotaMC;

    /**
     * Obtém o valor da propriedade respotaMC.
     * 
     */
    public float getRespotaMC() {
        return respotaMC;
    }

    /**
     * Define o valor da propriedade respotaMC.
     * 
     */
    public void setRespotaMC(float value) {
        this.respotaMC = value;
    }

}
