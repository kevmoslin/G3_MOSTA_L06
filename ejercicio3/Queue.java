package ejercicio3;

import actividad1.ExceptionIsEmpty;

public interface Queue<T> {
    void enqueue(T elemento);
    T dequeue() throws ExceptionIsEmpty;
    boolean isEmpty();
}
