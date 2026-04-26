import java.util.Stack;

public class StringReversalAndPalindrome {
   public static void main(String[] args) {
        String[] arr = {"add", "hello", "mam", "java", "racecar", "a"};
        for (String str :arr){
            String reversed = reverseString(str);
          // boolean result = isPalindrome(str);
            System.out.println("Original: " + str);
            System.out.println("Reversed: " + reversed);
           //System.out.println("Palindrome: " + result);

    }}
         public static String reverseString(String str){
        Stack<Character>stack=new Stack<>();
        String reversed= " ";
        for (int i = 0 ; i <str.length(); i++){
            stack.push(str.charAt(i));

            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

        }
             return reversed;
        // }
            //public static boolean isPalindrome(String str) {

            //    String re= reverseString(str);

             //  return str.equalsIgnoreCase(re);
            //}
        }
}