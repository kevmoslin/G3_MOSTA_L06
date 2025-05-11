package actividad2;

import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        QueueLink<Integer> cola = new QueueLink<>();

        try {
            cola.enqueue(10);
            cola.enqueue(20);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
