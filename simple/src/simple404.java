import java.util.LinkedList;
import java.util.Queue;

public class simple404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if (tmp.left != null && tmp.left.left == null && tmp.left.right == null){
                sum += tmp.left.val;
            }
            if (tmp.left != null) queue.offer(tmp.left);
            if (tmp.right != null) queue.offer(tmp.right);
        }
        return sum;
    }
}
