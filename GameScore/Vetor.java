package gamer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31842879
 */
public class Vetor {

    private Gamer[] A; // armazena os elementos do vetor
    private int capacity; // capacidade do vetor
    private int size; // elementos no vetor

    public Vetor(int capacity) {
        A = new Gamer[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size() {
        return size;
    }

    public Gamer get(int i) throws Exception {
        if(i<0 || i>=size){
            throw new Exception ("Posição inválida");
        }
        return A[i];
    }

    public void set(int i,Gamer gamer) throws Exception {
        if(i<0 || i>=size){
            throw new Exception ("Posição inválida");
        }
        A[i]=gamer;
    }
    public void add(int i,Gamer gamer) throws Exception {
        if(size == capacity){
            throw new Exception("Não há espaço na lista");
        }
        if(i < 0 || i > size){
            throw new Exception("Indice da lista Inválido");
        }
        for(int j = size-1;j>=i;j--){
            A[j+1]=A[j];
        }
        A[i]=gamer;
        size++;
    }

    public void remove(int i) throws Exception {
        if(isEmpty()){
            throw new Exception("Lista vazia!");
        }
        if(i < 0 || i >= size){
            throw new Exception("Indice da lista Inválido");
        }
        for(int j=i;j <= size - 2;j++){
            A[j]=A[j+1];
        }
        size--;
    }

    public int search(Gamer gamer) {
        for(int i = 0;i < size; i++){
            if(A[i] == gamer){
                return i;
            }
        }
        return -1;
    }
    public Gamer[] getArray() {
        return A;
    }
    public int econtrarPosicao(Gamer gamer){
        int i = 0;
        if (size == 0){
            return(i);
        }
        else{
        for(int j = 0;j<size;j++){
            if(A[j].score>gamer.score){
                i++;
                
            }
        }
        }
       return i;
    }
}
