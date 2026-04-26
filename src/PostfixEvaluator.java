import java.util.Stack;
public class PostfixEvaluator {
    static void main(String[] args) {
        String[] STR={"32+","69*","48-"};
        for (String S:STR){
            System.out.println("expersion :"+STR);
            System.out.println("RESULT :" + PostfixEva(STR));



        }

    }
    public static int PostfixEva(String STR){
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
                if (ch=='*') result=a*b;
                stack.push(result);



            }

        }
        return stack.pop();
    }
}
