import java.util.Stack;

public class StackSorter {
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();



}
    public static void sortStack(Stack<Integer> stack) {
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
