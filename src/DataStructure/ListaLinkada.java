package DataStructure;

public class ListaLinkada {
    private Node cabeca;
    private Node calda;
    private int tamanho;

    public class Node{
        public String data;
        public Node next;

        Node(String data){
            this.data = data;
        }
    }

    public ListaLinkada(String data){
        tamanho = 1;
        Node newNode = new Node(data);
        cabeca = newNode;
        calda = newNode;
    }

    public void getCabeca(){
        if(this.cabeca == null){
            System.out.println("Lista vázia");
        } else {
            System.out.println("Cabeça: " + cabeca.data);
        }
    }

    public void getCalda() {
        if (this.calda == null) {
            System.out.println("Lista vázia");
        } else {
            System.out.println("Calda: " + calda.data);
        }
    }

    public void getTamanho(){
        System.out.println("Tamanho: " + tamanho);
    }

    public void makeEmpty(){
        calda = null;
        cabeca = null;
        tamanho = 0;
    }

    public void print(){
        Node temp = this.cabeca;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(tamanho == 0){
            calda = newNode;
            cabeca = newNode;
        } else {
            calda.next = newNode;
            calda = newNode;
        }
        tamanho++;
    }
    //REMOVE O PRIMEIRO ELEMENTO DA LISTA
    public Node removeFirst(){
        if(tamanho == 0) return null;
        Node temp = cabeca;
        cabeca = cabeca.next;
        temp.next = null;
        tamanho--;

        if(tamanho == 0){
            calda = null;
            cabeca = null;
        }

        return temp;
    }

    //REMOVE O ÚLTIMO ELEMENTO DA LISTA
    public Node removeLast(){
        if (tamanho == 0) return null;
        Node pre = cabeca;
        Node temp = null;

        while (pre.next != calda){
            pre = pre.next;
        }

        temp = calda;
        calda = pre;
        calda.next = null;

        tamanho--;

        if(tamanho == 0){
            calda = null;
            cabeca = null;
        }

        return temp;
    }

    //ADICIONA NO COMEÇO DA LISTA
    public void prepend(String data){
        Node newNode = new Node(data);
        if(tamanho == 0){
            calda = newNode;
            cabeca = newNode;
        } else {
            newNode.next = cabeca;
            cabeca = newNode;
        }
        tamanho++;
    }

    //ADICIONAR EM UM INDICE ESPECIFICO DA LISTA
    public boolean insert (int index, String data){
        if(index < 0 || index > tamanho) return false;
        if(index == 0){
            prepend(data);
            return true;
        }
        if(index == tamanho - 1){
            append(data);
            return true;
        }

        Node newNode = new Node(data);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        tamanho++;
        return true;

    }

    //LER UM ITEM SELECIONADO DA LISTA
    public Node get(int index){
        if(index < 0 || index >= tamanho) return null;
        Node temp = cabeca;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    //MODIFICAR UM ELEMENTO DA LISTA
    public boolean set(int index, String data){
        Node temp = get(index);

        if(temp != null){
            temp.data = data;
            return true;
        }
        return false;
    }

    //REMOVER ITEM DE UM INDICE ESPECIFICO
    public Node remove(int index){
        if(index < 0 || index > tamanho) return null;
        if (index == 0 ){
            return removeFirst();
        }
        if(index == tamanho - 1){
            return removeLast();
        }

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        tamanho--;

        return temp;
    }
}
