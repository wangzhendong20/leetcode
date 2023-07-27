public class simple674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int[] dp = new int[nums.length];
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]){
                dp[i] = dp[i-1] + 1;
            }

            if (dp[i] > res) res = dp[i];
        }

        return res;
    }
}
