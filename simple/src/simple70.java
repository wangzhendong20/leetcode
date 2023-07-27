public class simple70 {
    public int climbStairs(int n) {
        if (n<=1) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];


        // 进阶版
        // 改为：一步一个台阶，两个台阶，三个台阶，.......，直到 m个台阶。问有多少种不同的方法可以爬到楼顶呢？
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= m; j++) {
//                if (i-j >=0){
//                    dp[i] += dp[i-j];
//                }
//            }
//        }
//        return dp[n];
    }
}
