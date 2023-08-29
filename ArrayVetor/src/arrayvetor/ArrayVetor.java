/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package arrayvetor;

import java.util.Arrays;

/**
 *
 * @author marques
 */
public class ArrayVetor {

    
    public static void main(String[] args) 
    {
        //Código aqui
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
                
        //Procurar por um valor específico de forma binária.
        //Caso o rresultado seja negativo é pq o valor não existe no vetor.
        int p = Arrays.binarySearch (vet, 1);
        for (int v : vet)
        {
            System.out.print(v + " ");
        }
        System.out.println("\nEncontrei o valor na posicao " + p);
        System.out.println("");
        
        //criar novo vetor vazio.
        int vetor[] = new int[20];
        //Preenche o vetor com o valor indicado.
        Arrays.fill(vetor, 0);
        for (int valor : vetor)
        {
            System.out.print(valor + " ");
        }
    }

}
