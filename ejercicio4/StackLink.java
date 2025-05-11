package ejercicio4;

public class StackLink<T> implements Stack<T> {
    private Node<T> top;

    public StackLink(){
        this.top = null;
    }

    public void push(T elemento){
        Node<T> newNode = new Node<>(elemento);
        newNode.siguiente = top;
        top = newNode;
    }

    public T pop() throws ExceptionIsEmpty{
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Stack is Empty");
        }
        T data = top.data;
        top = top.siguiente;
        return data;
    }

    public T top() throws ExceptionIsEmpty{
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Stack is Empty");
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
