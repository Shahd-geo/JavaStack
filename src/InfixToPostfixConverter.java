import java.util.Stack;

public class InfixToPostfixConverter {
    static void main(String[] args) {


    }
    public static Integer precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;

        }
        if (op == '*' || op == '/' || op == '%')
            return 2;
        if (op == '^') {
            return 3;
        }
        return 0;
    }
       public static String infixToPostfix(String expr) {
           Stack<Character> ops = new Stack<>();


       }


        }


    }
}
