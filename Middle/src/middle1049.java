import java.util.Arrays;

public class middle1049 {
    public int lastStoneWeightII(int[] stones) {
        if (stones == null || stones.length == 0) return 0;

        int n = stones.length;
        int sum = Arrays.stream(stones).sum();

        int target = sum / 2;

        int[] dp = new int[target+1];
        for (int i = 0; i < n; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j-stones[i]] + stones[i]);
            }
        }

        int res = (sum - dp[target]) - dp[target];
        return res;
    }
}
