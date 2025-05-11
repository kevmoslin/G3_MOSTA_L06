package actividad3;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<String, Integer> colaPrioridad = new PriorityQueueLinkSort<>();

        colaPrioridad.enqueue("A", 2);
        colaPrioridad.enqueue("B", 5);
    }
}
