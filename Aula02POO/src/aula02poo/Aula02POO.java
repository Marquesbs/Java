package aula02poo;

public class Aula02POO 
{
    
    public static void main(String[] args) 
    {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        
        Caneta c2 = new Caneta();
        c2.modelo = "Stylus";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }

}
