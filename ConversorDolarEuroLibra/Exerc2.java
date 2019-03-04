
package Lista_estruturas_de_controle;

import java.util.Scanner;


public class Exerc2 {

    public static void main(String[] args) {
        float custo;
        int moeda;
        double valor = 0 ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o custo da compra: ");
        custo = entrada.nextFloat();
        System.out.println("Dólar-1|Euro-2|Libra-3");
        System.out.println("Digite a moeda utilizada: ");
        moeda = entrada.nextInt();
        switch(moeda){
            case 1:
                valor = custo * 3.71;
                System.out.printf("O valor do Dólar para Real será:R$ %.2f",valor);
                break;
            case 2:
                valor = custo * 4.31;
                System.out.printf("O valor de Euro para Real será: %.2fR$",valor);
                break;
            case 3:
                valor = custo * 4.81;
                System.out.printf("O valor de Libra para Real será: %.2fR$",valor);
                break;
            default:
                System.out.println("Moeda inválida");
        }
    }
}