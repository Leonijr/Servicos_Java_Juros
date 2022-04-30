
package JuroWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the JuroWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JuroSimplesResponse_QNAME = new QName("br.edu.ifmt.cba", "JuroSimplesResponse");
    private final static QName _JuroCompostoResponse_QNAME = new QName("br.edu.ifmt.cba", "JuroCompostoResponse");
    private final static QName _MontanteCompostoResponse_QNAME = new QName("br.edu.ifmt.cba", "MontanteCompostoResponse");
    private final static QName _MontanteComposto_QNAME = new QName("br.edu.ifmt.cba", "MontanteComposto");
    private final static QName _MontanteSimples_QNAME = new QName("br.edu.ifmt.cba", "MontanteSimples");
    private final static QName _TaxaJuro_QNAME = new QName("br.edu.ifmt.cba", "TaxaJuro");
    private final static QName _TaxaJuroResponse_QNAME = new QName("br.edu.ifmt.cba", "TaxaJuroResponse");
    private final static QName _MontanteSimplesResponse_QNAME = new QName("br.edu.ifmt.cba", "MontanteSimplesResponse");
    private final static QName _JuroComposto_QNAME = new QName("br.edu.ifmt.cba", "JuroComposto");
    private final static QName _JuroSimples_QNAME = new QName("br.edu.ifmt.cba", "JuroSimples");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: JuroWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MontanteSimples }
     * 
     */
    public MontanteSimples createMontanteSimples() {
        return new MontanteSimples();
    }

    /**
     * Create an instance of {@link TaxaJuro }
     * 
     */
    public TaxaJuro createTaxaJuro() {
        return new TaxaJuro();
    }

    /**
     * Create an instance of {@link TaxaJuroResponse }
     * 
     */
    public TaxaJuroResponse createTaxaJuroResponse() {
        return new TaxaJuroResponse();
    }

    /**
     * Create an instance of {@link MontanteSimplesResponse }
     * 
     */
    public MontanteSimplesResponse createMontanteSimplesResponse() {
        return new MontanteSimplesResponse();
    }

    /**
     * Create an instance of {@link JuroComposto }
     * 
     */
    public JuroComposto createJuroComposto() {
        return new JuroComposto();
    }

    /**
     * Create an instance of {@link JuroSimples }
     * 
     */
    public JuroSimples createJuroSimples() {
        return new JuroSimples();
    }

    /**
     * Create an instance of {@link JuroSimplesResponse }
     * 
     */
    public JuroSimplesResponse createJuroSimplesResponse() {
        return new JuroSimplesResponse();
    }

    /**
     * Create an instance of {@link JuroCompostoResponse }
     * 
     */
    public JuroCompostoResponse createJuroCompostoResponse() {
        return new JuroCompostoResponse();
    }

    /**
     * Create an instance of {@link MontanteCompostoResponse }
     * 
     */
    public MontanteCompostoResponse createMontanteCompostoResponse() {
        return new MontanteCompostoResponse();
    }

    /**
     * Create an instance of {@link MontanteComposto }
     * 
     */
    public MontanteComposto createMontanteComposto() {
        return new MontanteComposto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroSimplesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "JuroSimplesResponse")
    public JAXBElement<JuroSimplesResponse> createJuroSimplesResponse(JuroSimplesResponse value) {
        return new JAXBElement<JuroSimplesResponse>(_JuroSimplesResponse_QNAME, JuroSimplesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroCompostoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "JuroCompostoResponse")
    public JAXBElement<JuroCompostoResponse> createJuroCompostoResponse(JuroCompostoResponse value) {
        return new JAXBElement<JuroCompostoResponse>(_JuroCompostoResponse_QNAME, JuroCompostoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteCompostoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "MontanteCompostoResponse")
    public JAXBElement<MontanteCompostoResponse> createMontanteCompostoResponse(MontanteCompostoResponse value) {
        return new JAXBElement<MontanteCompostoResponse>(_MontanteCompostoResponse_QNAME, MontanteCompostoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteComposto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "MontanteComposto")
    public JAXBElement<MontanteComposto> createMontanteComposto(MontanteComposto value) {
        return new JAXBElement<MontanteComposto>(_MontanteComposto_QNAME, MontanteComposto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "MontanteSimples")
    public JAXBElement<MontanteSimples> createMontanteSimples(MontanteSimples value) {
        return new JAXBElement<MontanteSimples>(_MontanteSimples_QNAME, MontanteSimples.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxaJuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "TaxaJuro")
    public JAXBElement<TaxaJuro> createTaxaJuro(TaxaJuro value) {
        return new JAXBElement<TaxaJuro>(_TaxaJuro_QNAME, TaxaJuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxaJuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "TaxaJuroResponse")
    public JAXBElement<TaxaJuroResponse> createTaxaJuroResponse(TaxaJuroResponse value) {
        return new JAXBElement<TaxaJuroResponse>(_TaxaJuroResponse_QNAME, TaxaJuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontanteSimplesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "MontanteSimplesResponse")
    public JAXBElement<MontanteSimplesResponse> createMontanteSimplesResponse(MontanteSimplesResponse value) {
        return new JAXBElement<MontanteSimplesResponse>(_MontanteSimplesResponse_QNAME, MontanteSimplesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroComposto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "JuroComposto")
    public JAXBElement<JuroComposto> createJuroComposto(JuroComposto value) {
        return new JAXBElement<JuroComposto>(_JuroComposto_QNAME, JuroComposto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JuroSimples }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "br.edu.ifmt.cba", name = "JuroSimples")
    public JAXBElement<JuroSimples> createJuroSimples(JuroSimples value) {
        return new JAXBElement<JuroSimples>(_JuroSimples_QNAME, JuroSimples.class, null, value);
    }

}
