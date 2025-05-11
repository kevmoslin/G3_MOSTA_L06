package ejercicio2;

public class QueueArray<T> implements Queue<T> {
    private T[] data;
    private int front, rear, size, capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
}
