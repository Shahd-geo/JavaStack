import java.util.Stack;

public class StackSorter {
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!temp.isEmpty() && temp.peek() > current) {
                stack.push(temp.pop());
            }
            }

        }



        }

    }
