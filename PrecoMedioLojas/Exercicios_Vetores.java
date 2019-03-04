
package exercicios_vetores;

import java.util.Scanner;


public class Exercicios_Vetores {

   
    public static void main(String[] args) {
    
    float [] num = new float [10];
    int i;
  
    float precom = 0;
    float media = 0;
    int cont = 0;
    
    Scanner ent = new Scanner(System.in);
    System.out.println("Digite os valores do produto nas 10 lojas : ");
    for (i=0; i<num.length; i++){
        num [i]  =ent.nextFloat();
        precom = (precom + num [i]);
       }
    media = precom/10;
    for (i=0; i<num.length; i++){
    if (num[i]>media)
        cont++;
    }
    
    System.out.println("Preço médio : "+ media);
    System.out.println("Quantidade de lojas com o preco acima da média é igual a " + cont);
    
    }
    
}
