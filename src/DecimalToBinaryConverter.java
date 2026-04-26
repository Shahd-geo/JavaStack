
public class DecimalToBinaryConverter {
    static void main(String[] args) {
        int[] num = {5, 10, 13, 7, 1, 8};
        for (int n : num) {
            System.out.println("decimal" + n);
            System.out.println("BINARY" + DecimalToBinary(n));
        }

    }

    public static String DecimalToBinary(int n) {
        Stack<Integer> STACK = new Stack<>();
        while (n > 0) {
            int remainder = n % 2;
            STACK.push(remainder);
            n = n / 2;
        }
        String BINARY = "";
        while (!STACK.isEmpty()) {
            BINARY += STACK.pop();
        }
        return BINARY;

    }
}

