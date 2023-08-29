/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package comparacaostring;

/**
 *
 * @author marques
 */
public class ComparacaoString {

    
    public static void main(String[] args) 
    {
         String nome1 = "Bruno";
         String nome2 = "Bruno";
         String nome3 = new String ("Bruno");
         String resultado;
         
         // == compara se o tipo é o mesmo
         resultado = (nome1==nome3) ? "igual":"diferente";
         System.out.println(resultado);
         
         //.equals verifica se o conteúdo de um objeto é igual ao conteúdo de outro objeto
         resultado = (nome1.equals(nome3)) ? "igual":"diferente";
         System.out.println(resultado);
    }

}
