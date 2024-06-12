import DataStructure.ListaLinkada;

public class Main {
    public static void main(String[] args) {
        ListaLinkada listalinkada = new ListaLinkada("Elemento 1");

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
    }
}