import java.util.Stack;

public class ParenthesesValidator {
    static void main(String[] args) {
        Stack<String>  parentheses=new Stack<>();
        parentheses.push("[]");
        parentheses.push("()");
        parentheses.push("[]()");
        parentheses.push("{}");
        parentheses.push("//");
        System.out.println(parentheses);


    }
    public static Boolean  isBalanced(String str){
        Stack<Character> STACK=new Stack<>();
        for (int i = 0 ; i < str.length();i++){

        }
    }}
