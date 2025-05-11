package ejercicio3;

public class PriorityQueueLinked<T> implements PriorityQueue<T> {
    private QueueLink<T>[] queues;
    private int levels;

    public PriorityQueueLinked(int levels) {
        this.levels = levels;
        queues = new QueueLink[levels];
        for (int i = 0; i < levels; i++) {
            queues[i] = new QueueLink<>();
        }
    }

    public void enqueue(T element, int priority) throws ExceptionIsEmpty{
        if (priority < 0 || priority >= levels){
            throw new ExceptionIsEmpty("Invalid priority");
        }
        queues[priority].enqueue(element);
    }

    public T dequeue() throws ExceptionIsEmpty{
        for (int i = 0; i < levels; i++) {
            if (!queues[i].isEmpty()) {
                return queues[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("Priority queue is empty");
    }
}
