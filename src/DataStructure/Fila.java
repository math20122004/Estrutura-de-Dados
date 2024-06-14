package DataStructure;

import java.util.Random;

public class Fila {
    private Node first;
    private Node last;
    private int tamanho;

    private class Node{
        int value;
        Node nodeNext;

        Node(int value){
            this.value = value;
        }

        public int getValue() {return this.value;}

    }

    public Fila(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        tamanho ++;
    }

    //METODOS GETTERS
    public void getFirst(){
        if(first != null){
            System.out.println("Primeiro: " + first.value);
        } else  {
            System.out.println("FILA VAZIA");
        }
    }

    public void getLast(){
        if (last != null){
            System.out.println("Último: " + last.value);
        } else {
            System.out.println("FILA VAZIA");
        }
    }

    public void getTamanho(){
        System.out.println("Tamanho: " + tamanho);
    }

    public void print(){
        Node temp = this.first;

        while (temp != null){
            System.out.println(temp.value);
            temp = temp.nodeNext;
        }
    }

    //METODO DE INSERIR
    public void enqueue (int value){
        Node newNode = new Node(value);

        if(tamanho == 0){
            first = newNode;
            last = newNode;
        } else {
            last.nodeNext = newNode;
            last = newNode;
        }
        tamanho ++;
    }

    public Node dequeue (){
        if (tamanho == 0) return null;

        Node temp = first;
        if (tamanho == 1){
            first = null;
            last = null;
        } else {
            first = first.nodeNext;
            temp.nodeNext = null;
        }
        tamanho --;

        return temp;
    }

    public static void filaMer(int n){
        var ramdom = new Random();
        int cliente = ramdom.nextInt(101);
        Fila fila = new Fila(cliente);
        System.out.println("Chegou o cliente: " + cliente);

        for(int i = 2; i <= n; i++){
            cliente = ramdom.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            fila.enqueue(cliente);
        }

        var node = fila.dequeue();
        while (node != null){
            System.out.println("Atendido o cliente: " + node.getValue());
            node = fila.dequeue();
        }
    }
}
