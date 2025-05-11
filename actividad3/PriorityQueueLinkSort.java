package actividad3;

public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {
    class EntryNode{
        E data;
        N priority;

        EntryNode(E data, N priority){
            this.data = data;
            this.priority = priority;
        }

        public String toString(){
            return data + " (" + priority + ")";
        }
    }

    private Node<EntryNode> first;
    private Node<EntryNode> last;

    public PriorityQueueLinkSort(){
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x, N pr){
        EntryNode newEntry = new EntryNode(x, pr);
        Node<EntryNode> newNode = new Node<>(newEntry);
        
        if (isEmpty() || pr.compareTo(first.data.priority) > 0) {
            newNode.siguiente = first;
            first = newNode;
            if (last == null) {
                last = newNode;
            }
        } else{
            Node<EntryNode> current = first;
            while (current.siguiente != null && pr.compareTo(current.siguiente.data.priority) <= 0) {
                current = current.siguiente;
            }
            newNode.siguiente = current.siguiente;
            current.siguiente = newNode;
            if (newNode.siguiente == null) {
                last = newNode;
            }
        }
    }
    
}
