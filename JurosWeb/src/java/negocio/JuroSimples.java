package negocio;

public class JuroSimples {

    float capital;
    float taxa;
    int periodo;
    
    
  
    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }   
    
    
    
    public float juroSimples(){
        
        float tax = getTaxa()/100;
        float respJs = getCapital()* tax * getPeriodo();
    
        return respJs;
}
    
    public float montanteSimples(){
                
        float juroSim = juroSimples();
        float respMs = getCapital() + juroSim;
        
        return respMs;
    }
    
    public float taxaJuro(){
             
        float respTj = ((montanteSimples() / getCapital()) -1) ;
        respTj= respTj * 100;
        return respTj;
    }    
    
}
