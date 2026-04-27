import java.util.Stack;

public class InfixToPostfixConverter {
    static void main(String[] args) {


    }
    public static Integer precedence(char op){
        Stack<Character> ops = new Stack<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i< output.charAt(i);i++) {
            if (op == '+' || op == '-') {
                return 1;

            }
            if (op == '*' || op == '/' || op == '%')
                return 2;
            if (op == '^'){
                return 3;
            }

        }


    }
}
