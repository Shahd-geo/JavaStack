import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementFinder {
    static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] result = findNextGreaterElement(arr);





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
    public static void displayresult(int[] arr, int[] result) {
        System.out.println("Index\tValue\tNext Greater");
        for (int i = 0; i < arr.length; i++) {


            System.out.println(i + "\t" + arr[i] + "\t" + result[i]);


        }
    }
}
