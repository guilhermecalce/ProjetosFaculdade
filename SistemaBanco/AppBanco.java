
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class AppBanco {
    private static PequenoBanco banco;
    
    public static void main(String[] args) {
        banco = new PequenoBanco("Banco dos Programadores Java");
        menuPrincipal();
        DialogoGui.mostrarMsg("\n>> Obrigado por usar este banco!");
    }

    private static void menuPrincipal() {
        boolean sair = false;
        while (!sair) {
            int opcao = DialogoGui.menu("Criar conta normal", 
                                     "Criar conta com limite",
                                     "Criar conta-salário",
                                     "Mostrar informações do banco",
                                     "Salvar dados das contas",
                                     "Sair");
            if (opcao == 1) {
                criarContaNormal();
            }
            else if (opcao == 2) {
                criarContaComLimite();
            }
            else if (opcao == 3) {
                criarContaSalario();
            }
            else if (opcao == 4) {
                String s = "\n>> INFORMAÇÕES DO BANCO:\n" + banco;
                DialogoGui.mostrarMsg(s);
            }
            else if (opcao == 5) {
                carregarDados();
            }
            else if (opcao == 6) {
                sair = true;
            }
        }        
    }
    
    private static void criarContaNormal() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        ContaNormal c = new ContaNormal(num, nome, saldo);
        banco.adicionar(c);
    }
    private static void criarContaComLimite() {
        System.out.println("\n>> CRIAÇÃO DE CONTA COM LIMITE");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        double limite = DialogoGui.lerDouble("Limite da conta: ");
        ContaComLimite c = new ContaComLimite(num, nome, saldo, limite);
        banco.adicionar(c);
    } 
    private static void criarContaSalario() {
        System.out.println("\n>> CRIAÇÃO DE CONTA-SALÁRIO");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        String cnpj = DialogoGui.lerString("CNPJ da empresa contratante: ");
        ContaSalario c = new ContaSalario(num, nome, saldo, cnpj);
        banco.adicionar(c);
    } 
    public static void salvar(List<ContaAbstrata> lista) {
        try (PrintWriter pw = new PrintWriter("banco.txt")) {
            for (ContaAbstrata v : lista) {
                String s = "";
                if (v instanceof ContaNormal) {
                    ContaNormal b = (ContaNormal) v;
                    s = "ContaNormal" + b.getNumero() + ";" + b.getCorrentista() + ";" + b.getSaldo();
                } else if (v instanceof ContaComLimite) {
                    ContaComLimite a = (ContaComLimite) v;
                    s = "ContaComLimite: " + a.getNumero() + ";" + a.getCorrentista()+ ";" + a.getSaldo() + ";" +  a.getLimite();
                } else if (v instanceof ContaSalario){
                    ContaSalario d = (ContaSalario) v;
                    s = "ContaSalário: " + d.getNumero()+ ";" + d.getCorrentista()+ ";" + d.getSaldo() + ";" + d.getCnpjContratante();
                }
                
                pw.println(s);
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Falha ao abrir arquivo!");
        }
    }
    private static List<ContaAbstrata> carregarDados() {
        List<ContaAbstrata> lista = new ArrayList<>();
        try {
            List<String> linhas = Files.readAllLines(Paths.get("banco.txt"));
            for (String linha : linhas) {
                String[] info = linha.split(";");
                ContaAbstrata v = null;
                if (info[0].equals("ContaNormal")) {
                    v = new ContaNormal(Integer.parseInt(info[1]), info[2], Double.parseDouble(info[3]));
                } else if (info[0].equals("ContaComLimite")) {
                    v = new ContaComLimite(Integer.parseInt(info[1]), info[2],Double.parseDouble(info[3]), Double.parseDouble(info[4]));
                } else if (info[0].equals("ContaSalario")){
                    v = new ContaSalario(Integer.parseInt(info[1]), info[2], Double.parseDouble(info[3]), info[4]);
                
                }
                lista.add(v);
            }
        } catch (IOException ex) {
            System.out.println(">> Falha na leitura do arquivo!");
        }
        return lista;
    }
}
