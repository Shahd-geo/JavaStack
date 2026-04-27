import java.util.Stack;

public class InfixExpressionEvaluator {
    static void main(String[] args) {
        String expr = "3+4*2";







}
    public static int precedence(char op) {
        if (op == '+' || op == '-'){
            return 1;
        }if (op == '*' || op == '/') {
            return 2;
        }
        return 0;


    }
    public static int applyOp(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        }
        if (op == '-') {
            return a - b;
        }
        if (op == '*') {
            return a * b;
        }
        if (op == '/') {
            return a / b;
        }
        return 0;
    }
    public static int evaluate(String expr) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == ' ') {
                continue;
            }
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                operand.push(num);
            } else if (ch == '(') {
                operator.push(ch);

            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    int b = operand.pop();
                    int a = operand.pop();
                    operand.push(applyOp(a, b, operator.pop()));
                }
                return operand.pop();
            }

        }
    }
