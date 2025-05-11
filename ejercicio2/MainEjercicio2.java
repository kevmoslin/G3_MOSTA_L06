package ejercicio2;

import actividad1.*;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Queue<String> cola = new QueueArray<>(4); 

        try {
            System.out.println("¿Está vacía?: " + cola.isEmpty());

            cola.enqueue("A");
            cola.enqueue("B");
            cola.enqueue("C");
            cola.enqueue("D");

            System.out.println("Eliminado: " + cola.dequeue()); 
            System.out.println("Eliminado: " + cola.dequeue()); 

            cola.enqueue("E"); 
            cola.enqueue("F"); 

            while (!cola.isEmpty()) {
                System.out.println("Eliminado: " + cola.dequeue());
            }

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
