
public class Pedido1 {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido(31887864, "José", "Eletronico");
        System.out.println(pedido01.SetDesc());
        System.out.println(pedido01.SetNome());
        pedido01.GetDesc("iPhone X ");
        pedido01.GetNome("Guilherme Silva");
        System.out.println("----------------------------------");
        System.out.println("Atualizado! ! ! ! ! ! !");
        System.out.println(pedido01.SetDesc());
        System.out.println(pedido01.SetNome());
        
    }
}
    
