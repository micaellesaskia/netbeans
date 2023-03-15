
package aula05lp;

import java.util.Scanner;

public class Sexo {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite sua sexualidade: ");
        String sexo = leia.next();
        
        if (sexo.equals("Feminino")){
            System.out.println("Seu sexo é feminino.");
        } else if(sexo.equals("Masculino")){
            System.out.println("Seu sexo é masculino.");
        } else if(sexo.equals("Outro")){
            System.out.println("Seu sexo é outro.");
        }
    }
    
}
