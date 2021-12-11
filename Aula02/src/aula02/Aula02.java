
package aula02;


public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;    
        c1.carga = 9;
        
        
        c1.destampar();
        // c1.status();
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta();
        c2.modelo = "Compact";
        c2.cor = "Vermelha";
        c2.ponta = 0.4f;
        
        c2.tampar();
        c2.rabiscar();
        
        
        
    }
    
}
