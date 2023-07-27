import java.util.*;

import static java.util.Collections.*;

public class middle107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> levelList = new ArrayList<>();
            int len = queue.size();
            while (len > 0){
                TreeNode tmpnode = queue.poll();
                levelList.add(tmpnode.val);
                if (tmpnode.left != null) queue.offer(tmpnode.left);
                if (tmpnode.right != null) queue.offer(tmpnode.right);
                len--;
            }
            res.add(levelList);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = res.size() - 1; i >= 0; i--) {
            result.add(res.get(i));
        }
        return result;
    }
}
