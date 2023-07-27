import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class middle40 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backtracing(candidates,target,0,used);
        return res;
    }

    private void backtracing(int[] candidates,int target,int startIndex, boolean[] used){
        if (sum == target){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {
            if (i > 0 && candidates[i] == candidates[i-1] && used[i-1]==false){
                continue;
            }

            sum += candidates[i];
            path.add(candidates[i]);
            used[i] = true;
            backtracing(candidates,target,i+1,used);
            used[i] = false;
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
