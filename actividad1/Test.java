package actividad1;

public class Test {
    public static void main(String[] args){
        Stack<Integer> pila = new StackArray<>(5);
        try{
            pila.push(10);
            pila.push(20);
            pila.push(30);
            System.out.println("tope: " + pila.top());
            System.out.println("contenido: " + pila.toString());
            System.out.println("pop: " + pila.pop());
            System.out.println("nuevo tope: " + pila.top());
        } catch (ExceptionIsEmpty e){
            System.out.println(e.getMessage());
        }
    }
}
