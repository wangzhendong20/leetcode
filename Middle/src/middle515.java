import java.util.*;

public class middle515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);
        while (!deque.isEmpty()){
            int levelSize = deque.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < levelSize; i++) {
                TreeNode tmp = deque.pollFirst();
                if (max < tmp.val){
                    max = tmp.val;
                }
                if (tmp.left != null) deque.offerLast(tmp.left);
                if (tmp.right != null) deque.offerLast(tmp.right);
            }
            res.add(max);
        }
        return res;
    }
}
