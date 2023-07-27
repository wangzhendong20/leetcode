import java.util.Arrays;
import java.util.Stack;

public class hard84 {
    public int largestRectangleArea(int[] heights) {
        /*
         双指针法超时
         */
        int[] minLeftIndex = new int[heights.length];
        int[] minRightIndex = new int[heights.length];

        int size = heights.length;;

        minRightIndex[0] = -1;
        for (int i = 1; i < heights.length; i++) {
            int t = i-1;
            while (t >= 0 && heights[t] >= heights[i]) t = minLeftIndex[t];
            minLeftIndex[i] = t;
        }

        minRightIndex[size - 1]  = size;
        for (int i = size-2; i >= 0; i--) {
            int t = i+1;
            while (t < size && heights[t] >= heights[i]) t = minRightIndex[t];
            minRightIndex[i] = t;
        }

        int res = 0;
        for (int i = 0; i < size; i++) {
            int sum = heights[i] * (minRightIndex[i] - minLeftIndex[i] - 1);
            res = Math.max(sum,res);
        }

        return res;
    }

    public int largestRectangleArea2(int[] heights) {
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length-1] = 0;
        for (int i = 0; i < heights.length; i++) {
            newHeights[i+1] = heights[i];
        }
        heights = newHeights;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[stack.peek()]){
                stack.push(i);
            }else if (heights[i] == heights[stack.peek()]){
                stack.pop();
                stack.push(i);
            }else {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                    int mid = stack.pop();
                    int left = stack.peek();
                    int right = i;
                    int w = right - left - 1;
                    int h = heights[mid];
                    res = Math.max(res,w*h);
                }
                stack.push(i);
            }
        }

        return res;
    }
}
