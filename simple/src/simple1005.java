import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class simple1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1,o2) -> Math.abs(o2) - Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 && k > 0){
                nums[i] *= -1;
                k--;
            }
        }

        if (k%2 == 1) nums[nums.length-1] *= -1;
        int res = 0;
        for (int num : nums) {
            res += num;
        }
        return res;

    }

}
