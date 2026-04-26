import java.util.Stack;

public class TextEditorWithUndoRedo {
    static void main(String[] args) {
    Stack<String>undo=new Stack<>();
    Stack<String>redo=new Stack<>();
    String text="";
    undo.push(text);
    text=text+"Hello";
    System.out.println(text);
    undo.push(text);
    text = text + " World";
    System.out.println(text);
    //und
        if (!undo.isEmpty()) {
            redo.push(text);
            text = undo.pop();


        }











    }
public static
