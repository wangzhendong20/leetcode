import java.util.LinkedList;
import java.util.Queue;

public class simple111 {
    public int minDepth(TreeNode root) {
        int level = 0;
        if (root == null) return level;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode tmp = queue.poll();
                if (tmp.left == null && tmp.right == null){
                    level++;
                    return level;
                }
                if (tmp.left != null) queue.offer(tmp.left);
                if (tmp.right != null) queue.offer(tmp.right);
            }
            level++;
        }
        return level;
    }
}
