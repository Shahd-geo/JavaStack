import java.util.Stack;

public class StackSorter {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        System.out.println("orginal :");
        displayStack(s);
        sortStack(s);
        System.out.println("After :");
        displayStack(s);
        System.out.println();

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

    public static void sortStackRecursive(Stack<Integer> stack) {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        sortStackRecursive(stack);
        insertInSortedOrder(stack, top);
    }
    public static void insertInSortedOrder(Stack<Integer> stack, int top) {
        if (stack.isEmpty() || top >= stack.peek()) {
            stack.push(top);
            return;
        }
        int value = stack.pop();
        insertInSortedOrder(stack, top);
        stack.push(top);
    }

        public static void displayStack(Stack<Integer> stack) {
        System.out.println( stack);
    }

}
