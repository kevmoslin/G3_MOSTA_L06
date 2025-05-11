package ejercicio3;

public class QueueLink<T> implements Queue<T> {
    private Node<T> first, last;

    public QueueLink() {
        first = last = null;
    }

    public void enqueue(T elemento){
        Node<T> newNode = new Node<>(elemento);
        if (isEmpty()) {
            first = last = newNode;
        } else{
            last.siguiente = newNode;
            last = newNode;
        }
    }

    public T dequeue(){
        T data = first.data;
        first = first.siguiente;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public boolean isEmpty(){
        return first == null;
    }
}
