import java.util.Stack;
public class MinStack {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    public static Integer push(int x) {
        mainStack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        System.out.println("PUSH:"+x);
    }
    public static int pop(){
       if (mainStack.isEmpty()) {
           System.out.println("Stack is empty");
           return -1;

       }

        }



    }

