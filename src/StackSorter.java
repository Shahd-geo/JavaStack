import java.util.Stack;

public class StackSorter {
    static void main(Strin= new Stack<>();
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);g[] args) {
            Stack<Integer> s
            System.out.println("orginal stack:" + s);
        System.out.println(sortStack(s));


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
