package gamer;


public class Gamer {
    String name;
    int score;
    Gamer(String name,int score){
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}

