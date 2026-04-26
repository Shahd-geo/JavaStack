import java.util.Stack;

public class BrowserNavigationSystem {

    public static void main(String[] args) {
        Stack<String>back=new Stack<>();
        Stack<String>forwared=new Stack<>();
        String PAGE = "";
        int max = 10;
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
        if (back.size() >= max) {
            System.out.println("History limit reached ");
            back.remove(0);

        }
        if (!PAGE.isEmpty()) {
            back.push(currentPage);
    }
        forwared.clear();
}
