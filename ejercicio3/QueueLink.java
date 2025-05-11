package ejercicio3;

import ejercicio2.*;
import ejercicio1.*;

public class QueueLink<T> implements Queue<T> {
    private Node<T> first, last;

    public QueueLink() {
        first = last = null;
    }

    public void enqueue(T elemento){
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            first = last = newNode;
        }
    }

    public T dequeu() throws ExceptionIsEmpty{

    }

    public boolean isEmpty(){
        return first == null;
    }
}
