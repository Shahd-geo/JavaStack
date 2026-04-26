import java.util.Stack;

public class BrowserNavigationSystem {
    Stack<String>back=new Stack<>();
    Stack<String>forwared=new Stack<>();
    String PAGE = "";
    int max = 10;
    public static void main(String[] args) {
        visitPage("linkedIn.com");
        visitPage("gitHub.com");
        visitPage("zoom.com");
        visitPage("googlemeet.com");

        goBack();
        goBack();
        goForward();
        visitPage("GEE.com");

        goForward();
        goBack();
        showHistory();


    }
    static void visitPage(String url) {

    }
}
