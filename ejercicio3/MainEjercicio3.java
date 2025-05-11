package ejercicio3;

public class MainEjercicio3 {
    public static void main(String[] args) {
        PriorityQueue<String> colaPrioridad = new PriorityQueueLinked<>(4); // 0 a 3
        try {
            colaPrioridad.enqueue("Tarea urgente", 0);
            colaPrioridad.enqueue("Tarea importante", 1);
            colaPrioridad.enqueue("Tarea común", 3);
            colaPrioridad.enqueue("Tarea media", 2);
            
            while (!colaPrioridad.isEmpty()) {
                System.out.println("Atendiendo: " + colaPrioridad.dequeue());
            }
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
