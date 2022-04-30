
package JuroWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de JuroSimplesResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="JuroSimplesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respotaJS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JuroSimplesResponse", propOrder = {
    "respotaJS"
})
public class JuroSimplesResponse {

    protected float respotaJS;

    /**
     * Obtém o valor da propriedade respotaJS.
     * 
     */
    public float getRespotaJS() {
        return respotaJS;
    }

    /**
     * Define o valor da propriedade respotaJS.
     * 
     */
    public void setRespotaJS(float value) {
        this.respotaJS = value;
    }

}
