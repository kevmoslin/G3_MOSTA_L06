package ejercicio3;

public interface PriorityQueue<T> {
    void enqueue(T element, int priority) throws ExceptionIsEmpty;
    T dequeue() throws ExceptionIsEmpty;
    boolean isEmpty();
}