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


        int val = mainStack.pop();

        if (val == minStack.peek()) {
            minStack.pop();
        }

        System.out.println("pop");
        return val;
    }

    // peek
    public static int peek() {
        if (mainStack.isEmpty()) return -1;
        return mainStack.peek();
    }

    // getMin
    public static int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return minStack.peek();
    }

    static void main(String[] args) {
        push(5);

        push(3);

        push(7);

        push(2);
        pop();
        pop();


    }



}



    }

