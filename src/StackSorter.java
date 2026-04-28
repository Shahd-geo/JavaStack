import java.util.Stack;

public class StackSorter {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        System.out.println("orginal :");
        displayStack( s);
        sortStack(s);
        System.out.println("After :");
        displayStack(s);
        System.out.println();


        Stack<Integer


    }

    public  static  sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!temp.isEmpty() && temp.peek() > current) {
                stack.push(temp.pop());
            }

            temp.push(current);
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static void displayStack(Stack<Integer> stack, String name) {
        System.out.println(name + ": " + stack);
    }

}
