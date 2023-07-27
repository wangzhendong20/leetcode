public class middle45 {
    public int jump(int[] nums) {
        int curDistance  = 0;
        int nextDistance  = 0;
        int res = 0;
        if (nums.length == 1) return 0;
        for (int i = 0; i < nums.length; i++) {
            nextDistance = Math.max(i+nums[i],nextDistance);
            if (i == curDistance){
                res++;
                curDistance = nextDistance;
                if (nextDistance >= nums.length-1) break;
            }
        }
        return res;
    }
}
