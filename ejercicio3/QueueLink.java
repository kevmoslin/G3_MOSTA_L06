package ejercicio3;

import ejercicio2.*;
import ejercicio1.*;

public class QueueLink<T> implements Queue<T> {
    private Node<T> first, last;

    public QueueLink() {
        first = last = null;
    }

    public void enqueue(T elemento){

    }

    public T dequeu() throws ExceptionIsEmpty{

    }

    public boolean isEmpty(){
        return first == null;
    }
}
