
package exc19;


public class Cliente {
    String codigo;
    String nomeCliente;
    
    Cliente (String codigo){
        this.codigo = codigo;
    }
    void ModNome(String nome){
        nomeCliente = nome;
    }
    public String RetNome(){
        return nomeCliente;
    }
    public String RetCode(){
        return codigo;
    }


    }


    

   

    

