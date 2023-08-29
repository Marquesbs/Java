/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package operadorternario;

/**
 *
 * @author marques
 */
public class OperadorTernario {

    
    public static void main(String[] args) 
    {
        //Código aqui
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
                
        /*
         * Operadores ternários possuem três condições
         * No exemplo abaixo lê-se que: a variável r recebera o valor correspondente ao resultado do booleano, ou seja,
         * se n1 for maior que n2 (expressão verdadeira), a variável r receberá o valor 0, se for falso, a variável r receberá o valor 1.
        */
        
        r = (n1 > n2) ? 0 : 1;
        System.out.println(r);
        
        //demonstrando o inverso, utilizando a variável como retorno
        // também é possível utilizar fórmulas
        n1 = 14;
        n2 = 9;
        r = (n1 > n2) ? n1 : n2;
        System.out.println(r);
    }

}
