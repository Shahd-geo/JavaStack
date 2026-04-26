import java.util.Stack
public class PostfixEvaluator {
    static void main(String[] args) {

    }
    public static int PostfixEvaluator(String STR){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0 ; i<STR.length();i++){
            char ch = STR.charAt(i);
            if (Character.isDigit(ch)){
                stack.push(ch-'0');
            } else if (ch=='+'||ch=='-' ||ch=='*') {
                int a = stack.pop();
                int b = stack.pop();
                int result=0;
                if (ch=='+') result=a+b;
                if (ch=='-') result=a-b;


            }

        }
    }
}
