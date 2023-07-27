import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class middle216 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        traversal(k,n,0,1);
        return res;
    }

    private void traversal(int k, int n, int sum, int startIndex){
        if (sum > n){
            return;
        }
        if (path.size() == k){
            if (sum == n){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            sum += i;
            path.add(i);
            traversal(k,n,sum,i+1);
            sum -= i;
            path.removeLast();
        }
    }
}
