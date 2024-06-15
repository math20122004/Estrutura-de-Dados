package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    public Node raiz;

    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node (int value){
            this.value = value;
        }

        public boolean isLeaf(){
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert (int value){
        if (raiz == null) raiz = new Node(value);
        else {
            Node newNode = new Node(value);
            Queue<Node> fila = new LinkedList<>();
            fila.add(raiz);

            while (fila.size() > 0){
                Node currentNode = fila.remove();
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                } else {
                    fila.add(currentNode.left);
                }
                if (currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                } else {
                    fila.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder(){
        preOrdem(raiz);
    }

    private void preOrdem (final Node node){
        //RAIZ DIREITA ESQUERDA
        if(node == null) return;
        System.out.println(node.value);
        preOrdem(node.left);
        preOrdem(node.right);
    }

    public void emOrdem(){
        emOrdem(raiz);
    }

    private void emOrdem (final Node node){
        //ESQUERDA RAIZ DIREITA
        if (node == null) return;
        emOrdem(node.left);
        System.out.println(node.value);
        emOrdem(node.right);
    }

    public void posOrdem(){
        posOrdem(raiz);
    }

    private void posOrdem(final Node node){
        //ESQUERDA DIREITA RAIZ
        if(node == null) return;
        posOrdem(node.left);
        posOrdem(node.right);
        System.out.println(node.value);
    }

    public void BFS(){
        if (raiz == null) return;
        Queue<Node> fila = new LinkedList<>();

        fila.add(raiz);

        while (!fila.isEmpty()){
            Node node = fila.remove();
            if(node.left != null) fila.add(node.left);
            if(node.right !=  null) fila.add(node.right);

            System.out.println(node.value);
        }
    }
}

