package Ex2_vetores;

import java.util.Scanner;

public class Ex2_Vetores {
    public static void main (String[]args) {
        float [] peso = new float [4];
        float [] altura = new float [4];
        float [] imc = new float [4];
        
        
        Scanner ent = new Scanner(System.in);
        for(int i = 0; i < 10 ; i++){
            System.out.println("Digite o seu peso: ");
            peso[i] = ent.nextFloat();
            System.out.println("Digite a sua altura em CM: ");
            altura[i] = ent.nextFloat();
            imc[i] = peso [i] / (altura[i] * altura[i]);
            System.out.println("Seu IMC é --->" + imc[i]*10000);
        
        
        
        
        
        }
           
    }
}
