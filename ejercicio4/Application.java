package ejercicio4;

import java.util.Scanner;

public class Application {
    public static boolean symbolBalancing(String s) throws ExceptionIsEmpty{
        StackLink<Character> stack = new StackLink<>();
        Scanner input = new Scanner(System.in);
        String linea = input.nextLine();            
        char[] caracteres = linea.toCharArray();    

        for (char ch : caracteres){
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                    (ch == ']' && open != '[') ||
                    (ch == '}' && open != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
