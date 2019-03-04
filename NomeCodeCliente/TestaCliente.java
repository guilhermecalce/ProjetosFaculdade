
package exc19;

import java.util.Scanner;


public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("31887864");
        Cliente cliente2 = new Cliente("31887865");
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do primeiro Cliente: " + cliente1.RetNome());
        
        
        System.out.println("Nome do segundo Cliente: " + cliente2.RetNome());
        
        cliente1.nomeCliente = ("José Silva");
        cliente2.nomeCliente = ("Roberto Fernandez");
        System.out.println("Atualizado! ! ! ! ! !");
        System.out.println("Nome do primeiro Cliente: " + cliente1.RetNome());
        System.out.println("Nome do segundo Cliente" + cliente2.RetNome());
    }
}
