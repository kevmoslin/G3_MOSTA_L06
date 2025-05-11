package ejercicio1;

public interface Stack<T> {
    void push(T element);
    T pop() throws ExceptionIsEmpty;
    T top() throws ExceptionIsEmpty;
    boolean isEmpty();
}