import java.util.Stack;

public class QueueUsingTwoStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

public static int Enqueue(int x) {
    s1.push(x);
    System.out.println("Enqueue: " + x);
    return x;
}
public static int dequeue() {
    if (s1.isEmpty() && s2.isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }
    if (s2.isEmpty()) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
    }

    int ret = s2.pop();
    System.out.println("Dequeue: " + ret);
    return ret;
}
    public static int peek() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.peek();
    }
    public static boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    public static int size() {
        return s1.size() + s2.size();
    }
    public static void main(String[] args) {
        Enqueue(1);
        Enqueue(2);
        Enqueue(3);
        Enqueue(4);
        dequeue();
        System.out.println("Peek: " + peek());
       dequeue();
        dequeue();
       dequeue();
        dequeue(); // empty case
    }
}










