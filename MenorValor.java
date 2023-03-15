
package aula05lp;

import java.util.Scanner;

public class MenorValor {
         public static void main(String [] args){
         
         Scanner leia = new Scanner(System.in);
         
         System.out.println("Digite o primeiro valor:");
         float n1 = leia.nextFloat();
         System.out.println("Digite o segundo valor:");
         float n2 = leia.nextFloat();
         System.out.println("Digite o terceiro valor:");
         float n3 = leia.nextFloat();
         System.out.println("Digite o quarto valor:");
         float n4 = leia.nextFloat();
         
         if (n1 < n2 && n1 < n3 && n1 < n4){ /* se = && */
             System.out.println("O menor número é: "+n1);
         }
         if (n2 < n1 && n2 < n3 && n2 < n4){
             System.out.println("O menor número é: "+n2);
         }
         if (n3 < n1 && n3 < n2 && n3 < n4){
             System.out.println("O menor número é: "+n3);
         }
         if (n4 < n1 && n4 < n2 && n4 < n3){
             System.out.println("O menor número é: "+n4);
         }
     } 
    
}
