package ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Stack<Integer> pila = new StackLink<>();

        try {
            pila.push(5);
            pila.push(10);
            pila.push(20);

            System.out.println("elemento eliminado: " + pila.pop());
            System.out.println("elemento en el tope: " + pila.top());
            System.out.println("esta vacia?: " + pila.isEmpty());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
