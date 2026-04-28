import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
}


    public static int findLargestRectangle(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {

                int h = heights[stack.pop()];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = h * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }
    public static int calculateArea(int[] heights, int start, int end, int height) {
        return (end - start + 1) * height;
    }
    public static void displayHistogram(int[] heights) {
        System.out.println("Histogram:");
        int max = 0;
        for (int h : heights) max = Math.max(max, h);





    }

        }




        }
