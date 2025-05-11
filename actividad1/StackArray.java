package actividad1;

class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;

    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }

    public void push(E x){
        if (isFull()) {
            throw new RuntimeException("Esta lleno");
        }
        array[++tope] = x;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("esta vacio");
        }
        return array[tope--];
    }

    public E top() throws ExceptionIsEmpty {

    }

    public boolean isEmpty() {
        return this.tope == -1;
    }

    public boolean isFull(){

    }

    public String toString(){

    }
}
