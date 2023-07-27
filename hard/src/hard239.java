import java.util.Deque;
import java.util.LinkedList;

public class hard239 {
    class MyQueue{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int x){
            while (!deque.isEmpty() && x > deque.getLast()){
                deque.removeLast();
            }
            deque.add(x);
        }

        public void poll(int x){
            if (!deque.isEmpty() && x == deque.peek()){
                deque.poll();
            }
        }
        public int peek(){
            return deque.peek();
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 1){
            return nums;
        }
        int len = nums.length - k + 1;
        int[] res = new int[len];
        MyQueue queue = new MyQueue();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        int j = 0;
        res[j++] = queue.peek();
        for (int i = k; i < nums.length; i++) {
            queue.poll(nums[i-k]);
            queue.add(nums[i]);
            res[j++] = queue.peek();
        }
        return res;
    }
}
