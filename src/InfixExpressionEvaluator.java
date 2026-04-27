import java.util.Stack;

public class InfixExpressionEvaluator {
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
        static Stack<Double>  operand = new Stack<>();






    }




    }
