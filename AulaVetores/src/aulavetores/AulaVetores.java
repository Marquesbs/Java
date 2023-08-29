/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package aulavetores;

import java.util.Arrays;

/**
 *
 * @author marques
 */
public class AulaVetores {

    
    public static void main(String[] args) 
    {
        int vetor[] = {3, 2, 8, 7, 5, 4};
        
        System.out.println("Primeiro for");
        for (int c = 0; c <= vetor.length - 1; c++)
        {
            System.out.println(vetor[c]);
        }
        //Colocar o vetor em ordem com Arrays 
        Arrays.sort(vetor);
        System.out.println("Segundo for `For each`");
        // para cada elemento do vetor, atribua à variável valor.
        // a variável criada deve ser do mesmo tipo do vetor.
        for (int valor: vetor)
        {
            System.out.println(valor);
        }
 
    }

}
