//Exercício de divisão e resto da divisão 1)
package lista_extra_vetores;

import java.util.Scanner;


public class Lista_extra_vetores {

    public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
      
        float x;
        float y;
        float div = 0;
        float resto = 0;
        
        
            System.out.println("Valor de X: ");
            x = entrada.nextInt();
            System.out.println("Valor de Y: ");
            y = entrada.nextFloat();
                   
        
        div = x / y;
        resto = x % y;
        System.out.println("Resultado da divisão :  "+ div);
        System.out.println("Resto da divisão : "+ resto);
   
    }
    
}
