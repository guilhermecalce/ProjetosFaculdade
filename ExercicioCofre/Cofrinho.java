/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cofre;

/**
 *
 * @author 31896006
 */
public class Cofrinho {
    boolean estado;
    double valorEmMoedas;
    int valorEmNotas;
    
    Cofrinho(double valorMoeda,int valorNotas){
        valorEmMoedas = valorMoeda;
        valorEmNotas = valorNotas;
    }

    Cofrinho() {
        valorEmMoedas = 0;
        valorEmNotas = 0;
    }
    void trancar(){
        estado = true;
        System.out.println("O cofrinho está trancado.");
    }
    void destrancar(){
        estado = false;
        System.out.println("O cofrinho está destrancado.");
    }
    void colocarDinheiro(int tipo, double valor){
        switch (tipo) {
            case 1: 
                valorEmMoedas = valorEmMoedas+valor;
                break;
            case 2:
                valorEmNotas = valorEmNotas+(int)(valor);
                break;
            default:
                System.out.println("Não existe a opção.");
                break;
        }
    }
    void tirarDinheiro(int tipo, double valor){
        switch (tipo){
            case 1:
                valorEmMoedas = valorEmMoedas - valor;
                break;
            case 2:
                valorEmNotas = valorEmNotas - (int)(valor);
                break;
        }
    }    
    double contarDinheiro(){
        double valorTotal = 0;
        valorTotal = valorEmMoedas+valorEmNotas;
        return(valorTotal);
                
    }
}
    
    

