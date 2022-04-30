
package JuroWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MontanteSimplesResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MontanteSimplesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="respotaMS" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MontanteSimplesResponse", propOrder = {
    "respotaMS"
})
public class MontanteSimplesResponse {

    protected float respotaMS;

    /**
     * Obtém o valor da propriedade respotaMS.
     * 
     */
    public float getRespotaMS() {
        return respotaMS;
    }

    /**
     * Define o valor da propriedade respotaMS.
     * 
     */
    public void setRespotaMS(float value) {
        this.respotaMS = value;
    }

}
