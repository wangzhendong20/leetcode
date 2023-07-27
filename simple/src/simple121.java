public class simple121 {
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            low = Math.min(low, prices[i]);
            res = Math.max(res, prices[i] - low);
        }

        return res;
    }
}
