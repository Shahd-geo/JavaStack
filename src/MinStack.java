import java.util.Stack;
public class MinStack {
    static Stack<Integer> mainStack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    public static Integer push(int x) {
        mainStack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
        System.out.println("PUSH:" + x);
        return x;
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
        System.out.println( push(5));
        System.out.println( push(3));
        System.out.println( push(7));
        System.out.println( push(2));
        System.out.println( pop());
        System.out.println( pop());
        System.out.println( pop());
        System.out.println( pop());
        System.out.println( push(1));
        System.out.println( push(4));
        System.out.println( pop());
        System.out.println( pop());
        System.out.println( pop());


    }



}




