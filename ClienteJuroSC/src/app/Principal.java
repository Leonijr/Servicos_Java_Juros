package app;

import javax.swing.JOptionPane;
import JuroWS.ServicoJuro;
import JuroWS.ServicoJSJC;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal {

    public static NumberFormat nf = new DecimalFormat("##,##0.00");
    
       
    private static ServicoJSJC servico;
    private static  ServicoJuro porta;
    
    static{
        servico = new ServicoJSJC();
        porta = servico.getOperadorJuros();
    
    }
    
    public static void main(String[] args) {
        
        String opcoesMenu = "[1] Calcular Juros Simples \n"+
                "[2] Calcular Juros Compostos \n"+
                "[3] Calcular Montante de Juros Simples \n"+
                "[4] Calcular Montante de Juros Compostos \n"+
                "[5] Calcular taxa de Juros Simples \n"+
                "[6] Sair";
        int opcao;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    null,opcoesMenu));
            
            switch (opcao){
                
                case 1:
                    jurosSimples();
                    break;
                case 2:
                    jurosCompostos();
                    break;
                case 3:
                    montanteJuroSimples();
                    break;
                case 4:
                    montanteJuroComposto();
                    break;
                case 5:
                    taxaJuros();
                    break;         
            }
       
        }while(opcao !=6);   
    }
    
    private static void jurosSimples() {
    
        float capital;
        float taxa;
        int periodo;
            
            capital = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça o capital"));
            if (capital > 0){
                taxa = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça a taxa"));
                if (taxa > 0 ){
                     periodo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Forneça o período"));
                     if (periodo > 0){
                        float calcJS = porta.juroSimples(capital, taxa, periodo);
                            JOptionPane.showMessageDialog(null,
                            "juros simples : R$ "+ nf.format(calcJS));
                     
                     }else{
                         JOptionPane.showMessageDialog(null,
                        "o valor do período não pode ser zero");
                     }
                }else{
                    JOptionPane.showMessageDialog(null,
                    "o valor da taxa não pode ser zero");
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "o valor do capital não pode ser zero");
        }
    }
    
    
    private static void jurosCompostos(){
        
        float capital;
        float taxa;
        int periodo;
        
            capital = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça o capital"));
            if (capital > 0){
                taxa = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça a taxa"));
                if (taxa > 0 ){
                     periodo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Forneça o período"));
                     if (periodo > 0){
                        float calcJC = porta.juroComposto(capital, taxa, periodo);
                            JOptionPane.showMessageDialog(null,
                            "juros compostos: R$ "+ nf.format(calcJC));
                     
                     }else{
                         JOptionPane.showMessageDialog(null,
                        "o valor do período não pode ser zero");
                     }
                }else{
                    JOptionPane.showMessageDialog(null,
                    "o valor da taxa não pode ser zero");
                }
            }else{
                JOptionPane.showMessageDialog(null,
                    "o valor do capital não pode ser zero");
            }
    }    
    
    private static void montanteJuroSimples(){
        
        float capital;
        float taxa;
        int periodo;
        
            capital = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça o capital"));
            if (capital > 0){
                taxa = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça a taxa"));
                if (taxa > 0 ){
                     periodo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Forneça o período"));
                     if (periodo > 0){
                        float calcMJS = porta.montanteSimples(capital, taxa, periodo);
                            JOptionPane.showMessageDialog(null,
                             "montante juros simples: R$ "+ nf.format(calcMJS));
                     
                     }else{
                         JOptionPane.showMessageDialog(null,
                        "o valor do período não pode ser zero");
                     }
                }else{
                    JOptionPane.showMessageDialog(null,
                    "o valor da taxa não pode ser zero");
                }
            }else{
                JOptionPane.showMessageDialog(null,
                    "o valor do capital não pode ser zero");
            }
    }
    
    
    private static void montanteJuroComposto(){
    
        float capital;
        float taxa;
        int periodo;
        
            capital = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça o capital"));
            if (capital > 0){
                taxa = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça a taxa"));
                if (taxa > 0 ){
                     periodo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Forneça o período"));
                     if (periodo > 0){
                        float calcMJC = porta.montanteComposto(capital, taxa, periodo);
                            JOptionPane.showMessageDialog(null,
                            "montante juros composto: R$ "+ nf.format(calcMJC));
                     
                     }else{
                         JOptionPane.showMessageDialog(null,
                        "o valor do período não pode ser zero");
                     }
                }else{
                    JOptionPane.showMessageDialog(null,
                    "o valor da taxa não pode ser zero");
                }
            }else{
                JOptionPane.showMessageDialog(null,
                    "o valor do capital não pode ser zero");
            }      
    }
    
    
    private static void taxaJuros(){
    
        float capital;
        float taxa;
        int periodo;
        
            capital = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça o capital"));
            if (capital > 0){
                taxa = Float.parseFloat(JOptionPane.showInputDialog(
                    "Forneça a taxa"));
                if (taxa > 0 ){
                     periodo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Forneça o período"));
                     if (periodo > 0){
                        float calcTJ = porta.taxaJuro(capital, taxa, periodo);
                            JOptionPane.showMessageDialog(null,
                            "taxa juros: "+  nf.format(calcTJ) + " %");
                     
                     }else{
                         JOptionPane.showMessageDialog(null,
                        "o valor do período não pode ser zero");
                     }
                }else{
                    JOptionPane.showMessageDialog(null,
                    "o valor da taxa não pode ser zero");
                }
            }else{
                JOptionPane.showMessageDialog(null,
                    "o valor do capital não pode ser zero");
            }  
    }
    
}
