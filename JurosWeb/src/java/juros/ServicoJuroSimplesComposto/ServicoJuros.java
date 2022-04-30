package juros.ServicoJuroSimplesComposto;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import negocio.JuroComposto;
import negocio.JuroSimples;


@WebService( name = "ServicoJuro",
            portName = "OperadorJuros",
            serviceName = "ServicoJSJC",
            targetNamespace = "br.edu.ifmt.cba")
public class ServicoJuros {
    
    JuroSimples juroS = new JuroSimples();
    JuroComposto juroC = new JuroComposto();
                
    @WebMethod(operationName = "JuroSimples")
    @WebResult(name = "respotaJS")
    public float juroSimples(@WebParam (name = "capital")float cap,
                             @WebParam (name = "taxa")float t,
                             @WebParam (name = "periodo")int p){
    
        float respJs;
        juroS.setCapital(cap);
        juroS.setTaxa(t);
        juroS.setPeriodo(p);
        respJs = juroS.juroSimples();
        
        return respJs;
    }
    
    @WebMethod(operationName = "MontanteSimples")
    @WebResult(name = "respotaMS")
    public float montanteSimples(@WebParam (name = "capital")float cap,
                             @WebParam (name = "taxa")float t,
                             @WebParam (name = "periodo")int p){
    
        float respMs;
        juroS.setCapital(cap);
        juroS.setTaxa(t);
        juroS.setPeriodo(p);
        respMs = juroS.montanteSimples();
        
        return respMs;
    }
    
    @WebMethod(operationName = "TaxaJuro")
    @WebResult(name = "respotaTJ")
    public float taxaJuroSimples(@WebParam (name = "capital")float cap,
                             @WebParam (name = "taxa")float t,
                             @WebParam (name = "periodo")int p){
    
        float respTj;
        juroS.setCapital(cap);
        juroS.setTaxa(t);
        juroS.setPeriodo(p);
        respTj = juroS.taxaJuro();
        
        return respTj;
    }
    
    
    @WebMethod(operationName = "JuroComposto")
    @WebResult(name = "respotaJC")
    public float juroComposto(@WebParam (name = "capital")float cap,
                             @WebParam (name = "taxa")float t,
                             @WebParam (name = "periodo")int p){
    
        float respJc;
        juroC.setCapital(cap);
        juroC.setTaxa(t);
        juroC.setPeriodo(p);
        respJc = juroC.juroComposto();
        
        return respJc;
    }
    
    @WebMethod(operationName = "MontanteComposto")
    @WebResult(name = "respotaMC")
    public float montanteComposto(@WebParam (name = "capital")float cap,
                             @WebParam (name = "taxa")float t,
                             @WebParam (name = "periodo")int p){
    
        float respMc;
        juroC.setCapital(cap);
        juroC.setTaxa(t);
        juroC.setPeriodo(p);
        respMc = juroC.montanteComposto();
        
        return respMc;
    }
    
        
    
}
