package exercícios_métodos;

import java.util.Scanner;


public class Exercícios_Métodos {
    
    
    
    public static void main (String []args){
        
       String opcao;
       float temp;
       inf();
       System.out.println("Digite C ou F para escolher a conversão: ");
       Scanner entrada = new Scanner(System.in);
       opcao = entrada.nextLine();
       System.out.println("Digite a temperatura: ");
       temp = entrada.nextFloat();
       switch(opcao){
           case "C":
            Ce(temp);
            break;
           case "F":
            Fa(temp);
            break;
       }  
    }
    public static void inf(){
        System.out.println(" C O N V E R S O R ");
        System.out.println("");
         
    }  
    public static float Fa(float f){
        float resultado;
        resultado = 5*(f-32)/9;
        System.out.println("A conversão de F --C F é: " + resultado);
        return resultado;
    }
        public static float Ce(float c){
        float resultado;
        resultado = (9*c/5) + 32;
        System.out.println("A conversão de C -->F  é: " + resultado);
        return resultado;
    }
    
    
   

}
        

