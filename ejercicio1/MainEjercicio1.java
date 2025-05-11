package ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {
        Stack<Integer> pila = new StackLink<>();

        try {
            pila.push(5);
            pila.push(10);
            pila.push(20);

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
