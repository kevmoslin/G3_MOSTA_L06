package actividad2;

import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> cola = new QueueLink<>();

        try {
            cola.enqueue(10);
            cola.enqueue(20);
            cola.enqueue(30);

            System.out.println("cola: " + cola.toString());
            System.out.println("frente: " + cola.front());
            System.out.println("ultimo: " + cola.back());

            System.out.println("elemento quitado: " + cola.dequeue());

            System.out.println("nueva cola: " + cola.toString());
            System.out.println("nuevo frente: " + cola.front());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
