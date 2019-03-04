
import java.util.Scanner;


public class Pedido {
    
        int codigo;
        String nomeCliente;
        String descricao;
        
        Pedido(int codigo, String nomeCliente, String descricao){
          this.codigo = codigo;
          this.nomeCliente = nomeCliente;
          this.descricao = descricao;

    }
    public void GetNome(String nome){
        nomeCliente = nome;
    }
    public void GetDesc(String descricao1){
        descricao = descricao1;
    }
    public String SetDesc(){
        return descricao;
    }
    public String SetNome(){
        return nomeCliente;
    }
   
}

