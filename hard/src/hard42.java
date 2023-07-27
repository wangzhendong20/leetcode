import java.util.Stack;

public class hard42 {
    public int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        maxLeft[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
        }

        maxRight[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int count = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if (count > 0) sum += count;
        }

        return sum;
    }

    public int trap2(int[] height) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int sum = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] < height[stack.peek()]){
                stack.push(i);
            }else if (height[i] == height[stack.peek()]){
                stack.pop();
                stack.push(i);
            }else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]){
                    int mid = stack.pop();
                    if (!stack.isEmpty()){
                        int h = Math.min(height[stack.peek()],height[i]) - height[mid];
                        int w = i - stack.peek() - 1;
                        sum += h * w;
                    }
                }
                stack.push(i);
            }
        }

        return sum;
    }
}
