import java.util.Stack;

public class ParenthesesValidator {
    static void main(String[] args) {
        Stack<String> parentheses = new Stack<>();
        parentheses.push("[]");
        parentheses.push("()");
        parentheses.push("[]()");
        parentheses.push("{}");
        parentheses.push("//");
        System.out.println(parentheses);


    }

    public static Boolean isBalanced(String str) {
        Stack<Character> STACK = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                STACK.push(ch);
            } else if (ch == '(' || ch == '{' || ch == '[') {
                if (STACK.isEmpty()) {
                    return false;

                }
                char top =STACK.pop();
                if ((ch==')'&&top!='(')||(ch==']'&&top!='[')||(ch=='}'&&top!='{')){
                    return false;
                }

            }
        }
        return true;
    }
}
