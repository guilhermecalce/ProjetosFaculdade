/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cofre;
import java.util.Scanner;
import java.text.DecimalFormat; 
/**
 *
 * @author 31896006
 */
public class Cofre {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Cofrinho vazio = new Cofrinho();
        System.out.print("Digite o valor de moedas: ");
        double valor = entrada.nextDouble();
        System.out.println("");
        vazio.colocarDinheiro(1, valor);
        System.out.print("Digite o valor das notas: ");
        valor = entrada.nextDouble();
        System.out.println("");
        vazio.colocarDinheiro(2, valor);
        vazio.destrancar();
        double valorTotal = vazio.contarDinheiro();
        System.out.println("O valor Total de Moedas é: " + vazio.valorEmMoedas);
        System.out.println("O valor Total de Notas é: " + vazio.valorEmNotas);
        System.out.println("O valor Total é: " + valorTotal);
        vazio.trancar();
        System.out.println("");    
        
        Cofrinho conteudo = new Cofrinho(0.5,5);
        valorTotal = conteudo.contarDinheiro();
        System.out.println("Valor Total:" + valorTotal);
        System.out.println("Valor Total de Moedas:" + conteudo.valorEmMoedas);
        System.out.println("Valor Total de Notas:" + conteudo.valorEmNotas);
        System.out.println("");
        if(conteudo.valorEmMoedas != 0 && conteudo.valorEmNotas != 0){
            System.out.print("Digite o valor de moedas a ser retirada: ");
            double retiradaMoedas = entrada.nextDouble();
            while (retiradaMoedas > conteudo.valorEmMoedas){
                System.out.print("Digite o valor de moedas a ser retirada: ");
                System.out.println("Valor Total de Moedas:" + conteudo.valorEmMoedas);
                retiradaMoedas = entrada.nextDouble();
            }
            conteudo.tirarDinheiro(1, retiradaMoedas);
            while(conteudo.valorEmMoedas != 0){
                System.out.println("Valor Total de Moedas:" + conteudo.valorEmMoedas);
                System.out.print("Digite o valor de moedas a ser retirada: ");
                retiradaMoedas = entrada.nextDouble();
                conteudo.tirarDinheiro(1, retiradaMoedas);
            }
            System.out.println("Valor Total de Moedas:" + conteudo.valorEmMoedas);
        }    
        if (conteudo.valorEmNotas != 0){
            System.out.print("Digite o valor de Notas a ser retirada: ");
            double retirarNotas = entrada.nextDouble();
            while(conteudo.valorEmNotas < retirarNotas){
                System.out.println("Valor maior que o saldo disponível");
                System.out.print("Digite o valor de Notas a ser retirada: ");
                retirarNotas = entrada.nextDouble();
            }
            conteudo.tirarDinheiro(2, retirarNotas);
            valorTotal = conteudo.contarDinheiro();
            System.out.println("Valor Total de Moedas:" + conteudo.valorEmMoedas);
            System.out.println("Valor Total de Notas:" + conteudo.valorEmNotas);
            System.out.println("Valor Total:" + valorTotal);
        }
  
    }    
}
