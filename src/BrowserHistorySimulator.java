import java.util.Stack;

public class BrowserHistorySimulator {
    static void main(String[] args) {
        Stack<String> URL = new Stack<>();
        URL.push("file:///C:/Users/codel/Downloads/Java%20Stack.pdf");
        URL.push("https://app.clickup.com/90182612218/v/b/6-901817329466-2");
        URL.push("https://github.com/Shahd-geo/JavaStack");
        URL.push("https://app.clickup.com/90182612218/v/b/4-901810590662-2");
        URL.push("file:///C:/Users/codel/Downloads/Java%20Basics%20-%20String%20Tasks%20Set%203.pdf");
        System.out.println(URL);
        String removed=URL.pop();
        System.out.println("POPED ELEMENTS :"+removed);
        System.out.println("ASTCK AFTER POP :"+URL);
        System.out.println("top elements peack :"  +URL.peek());
        System.out.println(URL.isEmpty());
        URL.clear();
        System.out.println(URL.isEmpty());
        URL.push("https://www.amazon.ae/?&linkCode=ll2&tag=enae-edge-ntp-topsites-curate-ana-21&linkId=14e64b9e650b70d14e2bcd88c13a0c3a&language=en_AE&ref_=as_li_ss_tl");
        URL.push("https://www.booking.com/");





    }
}