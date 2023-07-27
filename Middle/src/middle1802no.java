public class middle1802no {
    public static void main(String[] args) {
        int n = 4, index = 2,  maxSum = 6;
        System.out.println(maxValue(n,index,maxSum));
    }

    public static int maxValue(int n, int index, int maxSum) {
        int left = 1, right = maxSum;
        while (left < right){
            int mid = (left + right + 1) / 2;
            if(sum(mid - 1, index) + sum(mid, n-index) <= maxSum){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static long sum(long x, int cnt){
        long res = 0;
        if (x >= cnt){
            res = (x + x - cnt + 1) * cnt / 2;
        }else {
            res = (x + 1) * x / 2 + cnt - x;
        }
        return res;
    }
}
