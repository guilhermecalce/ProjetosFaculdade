
package AtletasIMC;




public class TesteIMC {
   
    public static void main(String[] args) {
       
        DadosFisicos dados = new DadosFisicos();
        Atleta atleta1 = new Atleta();
        dados.altura = 1.88;
        dados.idade = 25;
        dados.peso = 98;
        
        atleta1.nome = "Pedro";
        atleta1.numCamisa = 12;
        atleta1.status = false;
        atleta1.posicao = "Centroavante";
        
        atleta1.dados = dados;
        atleta1.exibirDados();
        double resultado;
        resultado = atleta1.dados.calcularImc();
        if (resultado <= 18.5){
        System.out.println("Jogador tem peso abaixo da normalidade");
        }
        else if(resultado > 18.5 && resultado <= 25){
         System.out.println("jogador tem peso dentro da normalidade");
        }
        else if(resultado > 25 && resultado <= 30){
        System.out.println("Jogador tem peso acima da normalidade");
        }
        else{
        System.out.println("Jogador está obeso");        
        }
    
        if(atleta1.status == false){
            atleta1.alteraStatus();
            if (atleta1.status == true) {
                System.out.println("O atleta agora é titular do time!");
            }
            else{
                System.out.println("O atleta não pode ser titular!");
            }
        }
}

}
    
    
    
    

    

