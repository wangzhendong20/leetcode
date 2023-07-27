import java.util.Arrays;

public class middle416 {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;
        int sum = 0;
        sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) return false;
        int target = sum/2;
        int[] dp = new int[target+1];

        for (int i = 0; i < n; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j-nums[i]] + nums[i]);
            }

            if (dp[target] == target) return true;
        }

        return false;
    }
}
