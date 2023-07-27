import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class simple1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] > nums[j]){
                    res[i]++;
                }
            }

            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    res[i]++;
                }
            }
        }

        return res;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = Arrays.copyOf(nums,nums.length);
        Arrays.sort(res);
        for (int i = 0; i < res.length; i++) {
            if (!map.containsKey(res[i])){
                map.put(res[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(nums[i]);
        }

        return res;
    }
}
