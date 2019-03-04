
package Exc2;
import java.util.Scanner;

public class TestaMes {
    public static void main(String[] args) {
        int n;
        String[] mes ={"Janeiro","Fevereiro","marco","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um número entre 1 a 12: \n");
        n = entrada.nextInt();
        while( n<1 && n>12){
            System.out.println("erro!");
        System.out.println("Escolha um número entre 1 a 12: \n");
        n = entrada.nextInt();
        }
        if(n == 1) {
            System.out.println(mes[n-1]);
        }
        else if(n == 2) {
            System.out.println(mes[n-1]);
        }
        else if(n == 3) {
            System.out.println(mes[n-1]);
        }
        else if(n == 4) {
            System.out.println(mes[n-1]);
        }
        else if (n == 5) {
            System.out.println(mes[n-1]);
        }
        else if(n == 6) {
            System.out.println(mes[n-1]);
        }
        else if(n == 7) {
            System.out.println(mes[n-1]);
        }
        else if(n == 8) {
            System.out.println(mes[n-1]);
        }
        else if(n == 9) {
            System.out.println(mes[n-1]);    
        }
        else if(n == 10) {
            System.out.println(mes[n-1]);
        }
        else if(n == 11) {
            System.out.println(mes[n-1]);    
        }
        else if(n == 12) {
            System.out.println(mes[n-1]);    
        }

        while(n != -1){
        System.out.println("Escolha um número entre 1 a 12: \n");
        n = entrada.nextInt();
        if(n == 1) {
            System.out.println(mes[n-1]);
        }
        else if(n == 2) {
            System.out.println(mes[n-1]);
        }
        else if(n == 3) {
            System.out.println(mes[n-1]);
        }
        else if(n == 4) {
            System.out.println(mes[n-1]);
        }
        else if (n == 5) {
            System.out.println(mes[n-1]);
        }
        else if(n == 6) {
            System.out.println(mes[n-1]);
        }
        else if(n == 7) {
            System.out.println(mes[n-1]);
        }
        else if(n == 8) {
            System.out.println(mes[n-1]);
        }
        else if(n == 9) {
            System.out.println(mes[n-1]);    
        }
        else if(n == 10) {
            System.out.println(mes[n-1]);
        }
        else if(n == 11) {
            System.out.println(mes[n-1]);    
        }
        else if(n == 12) {
            System.out.println(mes[n-1]);    
        }
        }
    }
    
    
}
