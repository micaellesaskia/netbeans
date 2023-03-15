
package aula05lp;

import java.util.Scanner;

public class ValorInteiro {
    
     public static void main(String[] args){
        
    Scanner leia = new Scanner(System.in);
        
       System.out.println("Digite um valor do tipo inteiro: ");
       int n1 = leia.nextInt();
        
       if (n1 % 2 == 1 && n1 > 100){
         System.out.println("Seu número é: "+n1);
      } else {
         System.out.println("Número não indentificado.");
        }
    } 
    
}
