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
        }else{
            this.last.siguiente(aux);
            this.last = aux;
        }
    }
}
