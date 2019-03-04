package ContasFuncionario;


import java.util.Scanner;



public class TestaFuncionario {

    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        Funcionario func1 = new Funcionario(1000, "Guilherme");
        
       
        System.out.println("Funcionário 1");
   
 
         
        System.out.println("Digite uma porcentagem de aumento salarial: ");
double percentual = input.nextDouble();
func1.recebeAumento(percentual);

System.out.println("Digite o nome do departamento: ");
        func1.nomeDoDepartamento = input.next();

       func1.exibeInformacoes();
         System.out.println("Ganho anual:..3f "+ func1.calculaGanhoAnual());
         System.out.println("");
         System.out.println("Funcionário 2");
        
         
         //Funcionario 2 ---> Terminar
 
        Funcionario func2 = new Funcionario(3500, "Maria");
   
 
         
        System.out.println("Digite uma porcentagem de aumento salarial: ");
 percentual = input.nextDouble();
func2.recebeAumento(percentual);

System.out.println("Digite o nome do departamento: ");
        func2.nomeDoDepartamento = input.next();

       func2.exibeInformacoes();
         System.out.println("Ganho anual::..2f "+ func2.calculaGanhoAnual());
         

        
    
    }
    
}
