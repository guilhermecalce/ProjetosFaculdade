package gamer;
public class TesteGamer {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("Guilherme",450);
        Gamer gamer2 = new Gamer("João",150);
        Gamer gamer3 = new Gamer("Maria",800);
        Gamer gamer4 = new Gamer("Isabelle",230);
        Gamer gamer5 = new Gamer("Camila",700);
        
        Vetor vet = new Vetor(10);
        try{
            int x = vet.econtrarPosicao(gamer1);
            vet.add(x, gamer1);
            x = vet.econtrarPosicao(gamer2);
            vet.add(x, gamer2);
            x = vet.econtrarPosicao(gamer3);
            vet.add(x, gamer3);
            x = vet.econtrarPosicao(gamer4);
            vet.add(x, gamer4);
            x = vet.econtrarPosicao(gamer5);
            vet.add(x, gamer5);
            for(int i=0;i<vet.size();i++){
                System.out.println("");
                Gamer y = vet.get(i);
                System.out.println("Posição: "+(i+1)+"°"+"\nNome: "+y.name+"\nScore: "+ y.score);
            }
            Gamer z = vet.get(0);
            System.out.println("________________________________");
            System.out.println("Primeiro colocado - 1º: "+z.name);
            vet.remove(2);
            System.out.println("________________________________");
            for(int i=0;i<vet.size();i++){
                System.out.println("");
                Gamer y = vet.get(i);
                System.out.println("Posição: "+(i+1)+"°"+"\nNome: "+y.name+"\nScore: "+ y.score);
            }
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
        
    }
}
