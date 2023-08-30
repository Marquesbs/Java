package exercicio02poo;

public class Exercicio02POO 
{
    
    public static void main(String[] args) 
    {
        Livro livro1 = new Livro();
        
        livro1.nome = "12 regras para a vida";
        livro1.ano = 2021;
        livro1.autor = "Jordan Peterson";
        
        livro1.Abrir();
        livro1.Ler();
    }

}
