public class middle53 {
    public int maxSubArray(int[] nums) {
        /*
        贪心算法
         */
        int res = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > res) res = count;
            if (count <= 0) count = 0;
        }
        return res;
    }

    public int maxSubArray2(int[] nums) {
        /*
        动态规划
         */
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            if (dp[i] > res) res = dp[i];
        }

        return res;
    }

}
