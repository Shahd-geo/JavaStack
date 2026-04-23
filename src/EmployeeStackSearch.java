import java.util.Stack;

public class EmployeeStackSearch {
    static void main(String[] args) {
        Stack<String> STACK=new Stack<>();
        STACK.push("READ");
        STACK.push("WRITE");
        STACK.push("ENTER");
        STACK.push("LEAVE");
        STACK.push("WORK");
        STACK.push("MEET");
        System.out.println(STACK);
        STACK.search(2);


    }
}
