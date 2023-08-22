package salariocombonus;

import java.util.Scanner;

public class SalarioComBonus
{

    public static void main(String[] args)
    {
        //Lê dados de entrada do usuario
        Scanner leia = new Scanner(System.in);
        
        //Nome digitado
        String nome = leia.next();
        
        //Recebe Salario Fixo como string
        String salarioStr = leia.next();
        
        //Montante total de vendas como string
        String montanteStr = leia.next();
        
        // Converte o salario para double
        double salario = Double.parseDouble(salarioStr);

        // Converte o montante para double
        double montante = Double.parseDouble(montanteStr);
        
        //Calcula o valor de comissao em cima do montante de vendas
        double percent = montante * 0.15;
        
        // Calcula o valor total que o funcionario receberá
        double comissao = salario + percent;
        
        //Exibe o valor calculado
        System.out.printf("TOTAL = U$ %.2f%n", comissao);
        
        leia.close();
    }
    
}
