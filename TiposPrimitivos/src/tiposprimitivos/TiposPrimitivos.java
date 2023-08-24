package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos
{

    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = leia.nextLine();
        
        System.out.println("Digite a nota do aluno: ");
        float nota = leia.nextFloat();
        
        //formas de saída na tela
        // \n pula linha
        System.out.print("\nA nota de " + nome + " é " + nota);
        System.out.println("\nA nota de " + nome + " é " + nota);
        System.out.printf("A nota de %s é: %.2f\n", nome, nota);
        System.out.format("A nota de %s é: %.2f\n", nome, nota);
    }
    
}
