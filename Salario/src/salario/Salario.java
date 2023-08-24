package salario;

import java.util.Scanner;

public class Salario 
{

    public static void main(String[] args) 
    {
        //Recebe entrada do usuario
        Scanner leia = new Scanner(System.in);
        
        // Lê o número do funcionário
        int numero = leia.nextInt();
        
        // Lê as horas trabalhadas
        int horasTrabalhadas = leia.nextInt();
        
        // Lê o valor por hora como string
        String valorHoraStr = leia.next();
        
        // Converte o valor por hora para double
        double valorHora = Double.parseDouble(valorHoraStr);
        
        // Calcula o salário
        double salario = horasTrabalhadas * valorHora;
        
        // Imprime o número do funcionário
        System.out.println("NUMBER = " + numero);
        
        // Imprime o salário formatado com duas casas decimais
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
        // Fecha o scanner
        leia.close();
    }
}
