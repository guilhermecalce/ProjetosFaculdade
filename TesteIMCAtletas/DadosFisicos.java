
package AtletasIMC;

public class DadosFisicos {
    double peso;
    double altura;
    int idade;
    
    double calcularImc(){
    double imc;
    imc = peso / (altura * altura);
    return(imc);
    }
    
    void exibirDados(){
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
    
    
    }
    
    
    
    
    
    
    
    
    }
    

