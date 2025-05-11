package ejercicio2;

import actividad1.ExceptionIsEmpty;

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

    public void enqueue(T elemento) throws ExceptionIsEmpty{
        if (size == capacity) {
            throw new ExceptionIsEmpty("queue is full");
        }

        rear = (rear + 1) % capacity;
        data[rear] = elemento;
        size++;
    }

    public T dequeue() throws ExceptionIsEmpty{
        if (size == capacity) {
            throw new ExceptionIsEmpty("queue is empty");
        }
        T elemento = data[front];
        front = (front + 1) % capacity;
        size--;
        return elemento;
    }
}
