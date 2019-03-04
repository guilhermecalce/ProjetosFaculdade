package lista_estruturas_de_controle;

import java.util.Scanner;

public class Lista_estruturas_de_controle {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        float peso;
        float mediaIdade;
        int pesoAcima;
        float idadeFinal;
        mediaIdade = 0;
        pesoAcima = 0;
        for (int i = 0;i<5;i++){
            System.out.println("Idade:");
            idade = entrada.nextInt();
            System.out.println("Peso:");
            peso = entrada.nextFloat();
            mediaIdade = mediaIdade+idade;
            if (peso>90){
                pesoAcima++;                   
            }         
        }
        idadeFinal=mediaIdade/5;
        System.out.println("Média das Idades: "+idadeFinal);
        System.out.println("Quantidade de pessoas com peso maior que 90Kg: "+pesoAcima);
   
    }
    
}
