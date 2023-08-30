package aula02poo;

public class Caneta
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status()
    {
        System.out.println("\nUma caneta de modelo: " + this.modelo);
        System.out.println("De ponta: " + this.ponta);
        System.out.println("A cor desta caneta é: " + this.cor);
        if (tampada == true)
        {
            System.out.println("A caneta está tampada");
        }
        else 
        {
            System.out.println("A caneta está destampada");
        }
        System.out.printf("Esta caneta possui %d %% de carga\n", this.carga);
    }
    
    void rabiscar()
    {
        if (tampada == true)
        {
            System.out.println("ERRO!\nNão é possível rabiscar com uma caneta tampada!");
        }
        else
            System.out.println("Rabiscando...");
    }
    
    void tampar()
    {
        this.tampada = true;
    }
    
    void destampar()
    {
        this.tampada = false;
    }
}
