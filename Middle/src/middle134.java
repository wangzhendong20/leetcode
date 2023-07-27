public class middle134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int curSum = 0;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < gas.length; i++) {
//            int res = gas[i] - cost[i];
//            curSum += res;
//            if (curSum < min) {
//                min = curSum;
//            }
//        }
//        if (curSum < 0) return -1;
//        if (min >= 0) return 0;
//
//        for (int i = gas.length-1; i >= 0 ; i--) {
//            int res = gas[i] - cost[i];
//            min += res;
//            if (min >= 0){
//                return i;
//            }
//        }
//        return -1;


        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int res = gas[i] - cost[i];
            curSum += res;
            totalSum += res;
            if (curSum < 0){
                start = i+1;
                curSum = 0;
            }
        }
        if (totalSum < 0) return -1;
        return start;

    }
}
