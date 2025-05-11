package ejercicio3;

public class Node<E> {
    E data;
    Node<E> siguiente;

    public Node(E data){
        this.data = data;
        this.siguiente = null;
    }
}