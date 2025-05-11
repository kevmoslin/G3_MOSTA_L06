package actividad3;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> colaPrioridad = new PriorityQueueLinkSort<>();

        colaPrioridad.enqueue("A", 2);
        colaPrioridad.enqueue("B", 5);
        colaPrioridad.enqueue("C", 1);
        colaPrioridad.enqueue("D", 4);

        System.out.println("cola ordenada por prioridad: ");
        System.out.println(colaPrioridad);

        try {
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
