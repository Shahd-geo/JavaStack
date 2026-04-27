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
           StringBuilder out = new StringBuilder();
           for (char ch : expr.toCharArray()) {
               if (Character.isDigit(ch)) {
                   out.append(ch).append(" ");
               } else if (ch == '(') {
                   ops.push(ch);
               } else if (ch == ')') {
                   while (!ops.isEmpty() && ops.peek() != '(') {
                       out.append(ops.pop()).append(" ");
                   }
               } else { // operator
                   while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                       out.append(ops.pop()).append(" ");
                   }
                   ops.push(ch);
               }
               while (!ops.isEmpty()) {
                   out.append(ops.pop()).append(" ");
               }

               return out.toString();
           }
           return out.toString();

       }
       public static Integer evaluatePostfix(String postfix) {


           }





               }


        }


    }
}
