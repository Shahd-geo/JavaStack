import java.util.Stack;

public class InfixToPostfixConverter {
   public static void main(String[] args) {
        String infix = "3+4*2";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
        int result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);


    }
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/' || op == '%') return 2;
        if (op == '^') return 3;
        return 0;
    }

    public static String infixToPostfix(String expr) {

        Stack<Character> ops = new Stack<>();
        StringBuilder out = new StringBuilder();

        for (char ch : expr.toCharArray()) {

            if (Character.isDigit(ch)) {
                out.append(ch).append(" ");
            }

            else if (ch == '(') {
                ops.push(ch);
            }

            else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    out.append(ops.pop()).append(" ");
                }
                ops.pop(); // حذف (
            }

            else { // operator
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    out.append(ops.pop()).append(" ");
                }
                ops.push(ch);
            }
        }

// بعد انتهاء اللوب
        while (!ops.isEmpty()) {
            out.append(ops.pop()).append(" ");
        }

        return out.toString();
    }

    public static int evaluatePostfix(String STR) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < STR.length(); i++) {

            char ch = STR.charAt(i);

            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            else {
                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (ch == '+') result = a + b;
                if (ch == '-') result = a - b;
                if (ch == '*') result = a * b;
                if (ch == '/') result = a / b;

                stack.push(result);
            }
        }

        return stack.pop();
    }
}







