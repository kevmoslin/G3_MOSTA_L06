package ejercicio3;

import actividad1.*;

public interface PriorityQueue<T> {
    void enqueue(T element, int priority) throws ExceptionIsEmpty;
    T dequeue() throws ExceptionIsEmpty;
    boolean isEmpty();
}