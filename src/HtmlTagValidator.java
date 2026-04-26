import java.util.Stack;

public class HtmlTagValidator {
//    static void main(String[] args) {
//        System.out.println(validateHtmlTags("<div><p></p></div>"));
//            }

            public static boolean validateHtmlTags(String html) {

            Stack<String> STACK = new Stack<>();

                for (int i = 0; i < html.length(); i++) {

                    if (html.charAt(i) == '<') {

                        int j = html.indexOf('>', i);
                        String tag = html.substring(i + 1, j);

                        if (tag.startsWith("/")) {

                            String name = tag.substring(1);

                            if (STACK.isEmpty() || !STACK.pop().equals(name)) {
                                return false;
                            }

                        }
                        else {
                            STACK.push(tag);
                        }

                        i = j;
                    }
                }

                return STACK.isEmpty();
            }
        }

