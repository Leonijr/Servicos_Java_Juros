package negocio;

public class JuroComposto {

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

    public float montanteComposto(){
        
        float taxa1 = 1 + (getTaxa()/100);
        float potencia = (float) Math.pow(taxa1, getPeriodo());
        float respMc = getCapital()* potencia;
        
        return respMc;
    }
    
    public float juroComposto(){
        
        float respJc = montanteComposto() - getCapital();
    
        return respJc;
    }
    
}
