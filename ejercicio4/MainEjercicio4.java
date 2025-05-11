package ejercicio4;

public class MainEjercicio4 {
    public static void main(String[] args) {
        String[] pruebas = {
            "()()()[()()]",
            "((()))[]",
            "([)][](",
            "({[}])",
            "[",
            "[]{}[[]]{{()}}"
        };

        String cadena = "hola";

        for (String cadena : pruebas) {
            boolean balanceado = Application.symbolBalancing(cadena);
            System.out.println(cadena + " -> " + balanceado);
        }
    }
}
