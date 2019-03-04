package Ex2_lista_extra;

import java.util.Scanner;

public class Ex2_lista_extra {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        float kg;
        float kg_compras;
        float valor = 0;
        float valor_pago;
        float troco = 0 ;
        
        
            System.out.println("Valor do KG: ");
            kg = entrada.nextInt();
            System.out.println("KG comprados: ");
            kg_compras = entrada.nextFloat();
            valor = kg * kg_compras;
            System.out.println("Valor a ser pago: " + valor);
            valor = entrada.nextFloat();
            System.out.println("Valor pago : ");
            valor_pago = entrada.nextFloat();
        
            
                   
        
        
        troco = valor - valor_pago;
        
        System.out.println("Troco : "+ troco);
    }
    
}
