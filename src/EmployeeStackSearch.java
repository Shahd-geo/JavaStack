import java.util.Iterator;
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
        System.out.println(STACK.search("WORK"));
        System.out.println(STACK.contains("MEET"));
        for (int i = STACK.size()-1 ; i >=0 ; i--){
            System.out.println(STACK.get(i));

        }
        for (String EMPLOYYE :STACK){
            System.out.println(EMPLOYYE);
        }
        Iterator<String>IT=STACK.iterator();



    }
}
