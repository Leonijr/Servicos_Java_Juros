
package JuroWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de JuroCompostoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="JuroCompostoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respotaJC" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuroCompostoResponse", propOrder = {
    "respotaJC"
})
public class JuroCompostoResponse {

    protected float respotaJC;

    /**
     * Obtém o valor da propriedade respotaJC.
     * 
     */
    public float getRespotaJC() {
        return respotaJC;
    }

    /**
     * Define o valor da propriedade respotaJC.
     * 
     */
    public void setRespotaJC(float value) {
        this.respotaJC = value;
    }

}
