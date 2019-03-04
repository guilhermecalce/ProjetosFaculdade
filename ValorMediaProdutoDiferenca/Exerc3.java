
package Lista_estruturas_de_controle;
import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        int numUm;
        int numDois;
        int op;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o primeiro valor:");
        numUm = entrada.nextInt();
        System.out.println("");
        System.out.println("Digite o segundo valor:");
        numDois = entrada.nextInt();
        System.out.println("");
        while(true){
            System.out.println("1 - Média");
            System.out.println("2 - Produto");
            System.out.println("3 - Diferença");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.println("Digite a operação:");
            op = entrada.nextInt();
            if (op == 1){
                System.out.println("A média é: "+(numUm+numDois)/2);
                System.out.println("");
            }
            if (op == 2){
                System.out.println("O produto é: "+(numUm*numDois));
                System.out.println("");
            }
            if (op == 3){
                System.out.println("O diferença é: "+(numUm-numDois));
                System.out.println("");
            }
            if (op == 4){
                System.out.println("");
                System.out.println("Obrigado por utilizar o programa!!!!");
                break;
            }
        }
        
    }
        
}
