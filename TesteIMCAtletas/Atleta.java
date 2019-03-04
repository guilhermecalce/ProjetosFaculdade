
package AtletasIMC;


public class Atleta {
    String nome;
    int numCamisa;
    String posicao;
    boolean status;
    DadosFisicos dados;
    

int alteraStatus(){
double imc;
    imc = dados.calcularImc();
    if (imc > 25)
    return -1;
    else{
        this.status = true;
        return 0;
    }
}

void exibirDados(){
    System.out.println("Nome: " + nome);
    System.out.println("Camisa Nº: " + numCamisa);
    System.out.println("Posição: " + posicao);
    System.out.println("Status: " + status);
    dados.exibirDados();
}
    
    
    
    
    
}




