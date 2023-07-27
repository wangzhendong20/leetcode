import java.util.Arrays;
import java.util.Stack;

public class middle503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        Arrays.fill(res,-1);

        stack.add(0);
        for (int i = 1; i < nums.length * 2; i++) {
            if (nums[i % nums.length] <= nums[stack.peek()]) stack.add(i % nums.length);
            else {
                while (!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek()]){
                    res[stack.peek()] = nums[i % nums.length];
                    stack.pop();
                }
                stack.add(i % nums.length);
            }
        }

        return res;
    }
}
