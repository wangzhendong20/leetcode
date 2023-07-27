import java.util.Arrays;

public class middle1658no {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        System.out.println(minOperations(nums,x));

    }

//    public static int minOperations(int[] nums, int x) {
//        // 双指针
//        int n = nums.length;
//        int sum = Arrays.stream(nums).sum();
//
//        if (sum < x) {
//            return -1;
//        }
//
//        int right = 0;
//        int lsum = 0, rsum = sum;
//        int ans = n + 1;
//
//        for (int left = -1; left < n; ++left) {
//            if (left != -1) {
//                lsum += nums[left];
//            }
//            while (right < n && lsum + rsum > x) {
//                rsum -= nums[right];
//                ++right;
//            }
//            if (lsum + rsum == x) {
//                ans = Math.min(ans, (left + 1) + (n - right));
//            }
//        }
//
//        return ans > n ? -1 : ans;
//    }

    public static int minOperations(int[] nums, int x) {
        // 逆向思维+双指针
        // 把问题转换成从nums中移除一个最长的子数组，使得剩余元素的和为x。
        int target = -x;
        for (int num : nums) target += num;
        if (target < 0) return -1; // 全部移除也无法满足要求
        int ans = -1, left = 0, sum = 0, n = nums.length;
        for (int right = 0; right < n; ++right) {
            sum += nums[right];
            while (sum > target) sum -= nums[left++]; // 缩小子数组长度
            if (sum == target) ans = Math.max(ans, right - left + 1);
        }
        return ans < 0 ? -1 : n - ans;
    }
}
