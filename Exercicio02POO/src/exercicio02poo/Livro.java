package exercicio02poo;

public class Livro
{
    String nome;
    int ano;
    String autor;
    String editora;
    String condicao;
    boolean aberto;
    
    void Abrir()
    {
        this.aberto = true;
    }
    
    void Fechar()
    {
        this.aberto = false;
    }
    
    void Ler()
    {
        if (aberto == true)
        {
            System.out.printf("Você está lendo o livro %s, de %s.\n", nome, autor);
        }
        else
        {
            System.out.println("Você precisa abrir o livro para fazer isso.");
        }
    }
}
