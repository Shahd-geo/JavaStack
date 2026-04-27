import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementFinder {
    static void main(String[] args) {

    }

public static int[] findNextGreaterElement(int [] arr){
        int n = arr.length;
        int[] result=new int[n];
    Arrays.fill(result,-1);
    Stack<Integer> STACK=new Stack<>();
    for (int i = 0 ; i<n;i++){
        while (!STACK.isEmpty() && arr[STACK.peek()]<arr[i]]{
            int index = STACK.pop();
            result[index] = arr[i];
        }
        STACK.push(i);

        }
    return result;

    }
    }
}
