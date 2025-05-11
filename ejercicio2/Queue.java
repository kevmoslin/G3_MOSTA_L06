package ejercicio2;

import actividad1.ExceptionIsEmpty;

public interface Queue<T> {
    void enqueue(T element) throws ExceptionIsEmpty;
    T dequeue() throws ExceptionIsEmpty;
    boolean isEmpty();
}