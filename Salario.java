

package aula05lp;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args){
        
      Scanner leia = new Scanner (System.in);
        
      System.out.println("Digite seu salário:");
      float sal = leia.nextFloat();
        
      if (sal > 2.400 && sal < 5.500){
         System.out.println("Seu salário é: "+sal);
      } else {
         System.out.println("Você não tem salário suficiente");
        }
    }
    
}
