import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class middle90 {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums,0);
        return res;
    }

    private void backtracking(int[] nums,int startIndex){
        res.add(new ArrayList<>(path));
        if (startIndex >= nums.length){
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {

            if (i > startIndex && nums[i] == nums[i-1]){
                continue;
            }
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();

        }
    }
}
