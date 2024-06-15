import DataStructure.Arvore;
import DataStructure.Fila;
import DataStructure.ListaLinkada;
import DataStructure.Pilha;

public class Main {
    public static void main(String[] args) {
        //LISTA LINKADA
        ListaLinkada listalinkada = new ListaLinkada("Elemento 1");

        System.out.println("LISTA LINKADA:");
        listalinkada.append("Elemento 2");
        listalinkada.append("Elemento 3");
        listalinkada.prepend("Elemento 0 ");
        listalinkada.getCabeca();
        listalinkada.getCalda();
        listalinkada.getTamanho();
        listalinkada.print();
        System.out.println("===============================================");
        System.out.println(listalinkada.removeLast().data);
        System.out.println("===============================================");
        listalinkada.print();
        System.out.println("===============================================");
        System.out.println(listalinkada.removeFirst().data);
        System.out.println("===============================================");
        listalinkada.print();
        System.out.println("===============================================");
        System.out.println(listalinkada.get(1).data);
        System.out.println("===============================================");
        listalinkada.append("Elemento 3");
        listalinkada.append("Elemento 4");
        listalinkada.append("Elemento 5");
        listalinkada.insert(1, "Elemento 1.5");
        listalinkada.print();
        System.out.println("===============================================");
        listalinkada.set(0, "Elemento 1.25");
        listalinkada.print();
        System.out.println("===============================================");
        listalinkada.remove(0);
        listalinkada.remove(0);
        listalinkada.print();
        System.out.println("\n\n\n\n");

        //PILHA
        System.out.println("PILHA:");
        Pilha pilha = new Pilha(10);
        pilha.getTop();
        pilha.getAltura();
        pilha.print();
        pilha.push(12);
        pilha.push(8);
        pilha.print();
        pilha.getTop();
        pilha.pop();
        pilha.print();


        System.out.println("\n\n\n");
        int[] num = {1, 2, 3, 4, 5};
        Pilha.inverter(num);
        System.out.println("\n\n\n\n");

        //FILA
        Fila fila = new Fila(2);

        fila.getFirst();
        fila.getLast();
        fila.getTamanho();
        fila.print();
        fila.enqueue(1);
        fila.enqueue(6);
        fila.print();
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue() + "\n\n");
        Fila.filaMer(3);
        System.out.println("\n\n");

        //ÁRVORE
        Arvore arvore = new Arvore();
        arvore.insert(37);
        arvore.insert(11);
        arvore.insert(66);
        arvore.insert(8);
        arvore.insert(17);
        arvore.insert(42);
        arvore.insert(72);
        arvore.preOrder();
        System.out.println("==========================");
        arvore.emOrdem();
        System.out.println("==========================");
        arvore.posOrdem();
        System.out.println("==========================");


        System.out.println(arvore.raiz.value);
        System.out.println(arvore.raiz.left.value);
        System.out.println(arvore.raiz.right.value);

        System.out.println(arvore.raiz.isLeaf());
        System.out.println(arvore.raiz.left.isLeaf());
        System.out.println("==========================");

        arvore.BFS();

    }
}