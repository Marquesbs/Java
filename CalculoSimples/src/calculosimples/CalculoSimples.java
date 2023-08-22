package calculosimples;

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // Lê a primeira linha contendo as informações da peça 1
        String linhaPeca1 = leia.nextLine();
        String[] partesPeca1 = linhaPeca1.split(" ");
        
        // Extrai os valores da peça 1
        int codigoPeca1 = Integer.parseInt(partesPeca1[0]);
        int numPeca1 = Integer.parseInt(partesPeca1[1]);
        double valorPeca1 = Double.parseDouble(partesPeca1[2]);
        
        // Lê a segunda linha contendo as informações da peça 2
        String linhaPeca2 = leia.nextLine();
        String[] partesPeca2 = linhaPeca2.split(" ");
        
        // Extrai os valores da peça 2
        int codigoPeca2 = Integer.parseInt(partesPeca2[0]);
        int numPeca2 = Integer.parseInt(partesPeca2[1]);
        double valorPeca2 = Double.parseDouble(partesPeca2[2]);
        
        // Calcula o valor total a ser pago
        double valorTotal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
        
        // Imprime o resultado formatado
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        
        leia.close();
    }
}
