import java.util.Scanner;
public class TestaCarro {
    public static void main(String[] args) {
        Carro fusca;
        fusca = new Carro();
        fusca.ligar();
        fusca.buzinar();
        
        fusca.velocidadeAtual = 40;
        
        fusca.velocidadeMaxima = 60;
        
        Scanner ent = new Scanner(System.in);
        System.out.print("Quanto você quer acelerar? ");
        double valor = ent.nextDouble();
        
        int teste = fusca.acelerar(valor);
        System.out.println("A velocidade atual é "+ fusca.velocidadeAtual + "km/h");
        
        if(teste == -1)
            System.out.println("A velocidade atual é maior ou igual à velocidade máxima!!");
        
        System.out.println("A velocidade é igual ou superior à velocidade máxima!");
        switch(fusca.pegarMarcha()){
            case -1:
                System.out.println("Carro Parado");
                fusca.desligar();
            case 1:
                System.out.println("1ª marcha");
                break;
            case 2:
                System.out.println("2ª marcha");
                break;
            case 3:
                System.out.println("3ª marcha");
                break;
            case 4:
                System.out.println("4ª marcha");
                break;
            case 5:
                System.out.println("5ª marcha");
                break;
        
        }
        
        
        
    }
}
