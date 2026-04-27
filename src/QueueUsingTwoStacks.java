import java.util.Stack;

public class QueueUsingTwoStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

public static int Enqueue(int x) {
    s1.push(x);
    System.out.println("Enqueue: " + x);
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







    }


}
