
public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    
    //Método p/ ligar carro
    public static void ligar(){
        System.out.println("O carro está ligado!!");
    }
    //Método p/ buzinar carro
    public static void buzinar(){
        System.out.println("FON!!");
    
    }   
    //Método p/ acelerar o carro
    public int acelerar(double quantidade){
        double novaVelocidade = velocidadeAtual + quantidade;
        velocidadeAtual = novaVelocidade;
        
        if(novaVelocidade >= velocidadeMaxima)
            return -1;
        else
            return 0;
        
    
    }
    
    //Método Pegar Marcha
    int pegarMarcha(){
        if (velocidadeAtual == 0)
            
            return -1;
        else if(velocidadeAtual > 0 && velocidadeAtual <= 25)
            return 1;
        else if(velocidadeAtual > 25 && velocidadeAtual <= 40 )
            return 2;
        else if(velocidadeAtual > 40 && velocidadeAtual <= 60 )
            return 3;
        else if (velocidadeAtual > 60 && velocidadeAtual <= 80)
            return 4;
        else
            return 5;
            
            
        
        
    }
    
}
