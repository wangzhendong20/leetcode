import java.util.Arrays;

public class middle1658no {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        System.out.println(minOperations(nums,x));

    }

//    public static int minOperations(int[] nums, int x) {
//        // ˫ָ��
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
        // ����˼ά+˫ָ��
        // ������ת���ɴ�nums���Ƴ�һ����������飬ʹ��ʣ��Ԫ�صĺ�Ϊx��
        int target = -x;
        for (int num : nums) target += num;
        if (target < 0) return -1; // ȫ���Ƴ�Ҳ�޷�����Ҫ��
        int ans = -1, left = 0, sum = 0, n = nums.length;
        for (int right = 0; right < n; ++right) {
            sum += nums[right];
            while (sum > target) sum -= nums[left++]; // ��С�����鳤��
            if (sum == target) ans = Math.max(ans, right - left + 1);
        }
        return ans < 0 ? -1 : n - ans;
    }
}
