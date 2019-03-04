
package ContasFuncionario;

public class Funcionario {
    String nomeDoFuncionario;
    String nomeDoDepartamento;
    double salario;
    String rg;
    
    
    
    //construtor
    Funcionario(double salarioFunc, String nomeFunc){
    salario = salarioFunc;
    nomeDoFuncionario = nomeFunc;
  
    
    }

    Funcionario() {
    }
    //métodos do modelo
    public void recebeAumento(double percAumento){
        salario = salario + salario * (percAumento/ 100);
        
       
            
    }
    
    public double calculaGanhoAnual(){
        
       return salario * 12;
        
     
    }
    public void exibeInformacoes(){
        System.out.println("Seu nome é: "+nomeDoFuncionario);
        System.out.println("Nome do departamento: "+ nomeDoDepartamento);
        System.out.println("Salário atualizado: "+ salario);
        
        
        
        
    }

    

    
    }
    

