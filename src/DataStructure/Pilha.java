package DataStructure;

public class Pilha {
    private int altura;
    private No top;

    public class No{
        int value;
        No noNext;

        No(int value){
            this.value = value;
        }

        int getValue(){
            return value;
        }
    }

    public Pilha(int value){
        No newNode = new No(value);
        top = newNode;
        altura = 1;
    }

    //METODOS DE IMPRESSÃO (getters)
    public void getTop(){
        if(top == null){
            System.out.println("Lista Vázia");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    public void getAltura(){
        System.out.println("Altura: " + altura);
    }

    public void print(){
        No temp = this.top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.noNext;
        }
    }

    //METODO ADIÇÃO
    public void push(int value){
       No temp = new No(value);

       if(altura == 0){
           top = temp;
       } else {
           temp.noNext = top;
           top = temp;
       }
       altura++;
    }

    //METODO REMOÇÃO
    public No pop(){
        if (altura == 0) return null;

        No temp = top;
        top = top.noNext;
        temp.noNext = null;
        altura --;

        return temp;
    }

    //METODO INVERTER PILHA
    public static void inverter(final int [] numeros){
        Pilha pilha = new Pilha(numeros[0]);

        //índice 1 até 4 e vai interar na pilha
        //int[] = {1, 2, 3, 4, 5}
        //pilha = 5, 4, 3, 2, 1
        for (int i=1; i < numeros.length; i++){
            pilha.push(numeros[i]);
        }

        // pilha = 2, 3, 4, 5
        //node = 1
        var node = pilha.pop();
        while(node != null){
            System.out.println(node.getValue());
            //node = 2
            node = pilha.pop();
        }
    }
}
