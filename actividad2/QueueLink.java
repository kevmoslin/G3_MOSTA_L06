package actividad2;

import actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;
    
    public QueueLink(){
        this.first = null;
        this.last = null;
    }
    
    public void enqueue(E x){
        Node<E> aux = new Node<E>(x);
        if (this.isEmpty()) {
            this.first = aux;
            this.last = aux;
        }else{
            this.last.siguiente = aux;
            this.last = aux;
        }
    }

    public E dequeue() throws ExceptionIsEmpty{
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("cola vacia");
        }
        E dato = this.first.data;
        this.first = this.first.siguiente;
        if (this.first == null) {
            this.last = null;
        }
        return dato;
    }

    public E front() throws ExceptionIsEmpty{
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("cola vacia");
        }
        return this.first.data;
    }

    public E back() throws ExceptionIsEmpty{
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("cola vacia");
        }
        return this.last.data;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node<E> actual = this.first;
        while (actual != null) {
            sb.append(actual.data);
            if (actual.siguiente != null) {
                sb.append(", ");
            }
            actual = actual.siguiente;
        }
        sb.append("]");
        return sb.toString();
    }
}
