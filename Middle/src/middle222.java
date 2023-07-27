import java.util.LinkedList;
import java.util.Queue;

public class middle222 {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode tmp = queue.poll();
                if (tmp.left!=null) queue.offer(tmp.left);
                if (tmp.right!=null) queue.offer(tmp.right);
                sum++;
            }
        }
        return sum;
    }
}
