import java.util.LinkedList;
import java.util.Queue;

public class middle513 {
//    public int findBottomLeftValue(TreeNode root) {
//        if (root == null) return 0;
//        Queue<TreeNode> queue = new LinkedList<>();
//        int res = 0;
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            int len = queue.size();
//            TreeNode tmp = queue.poll();
//            res = tmp.val;
//            if (tmp.left != null) queue.offer(tmp.left);
//            if (tmp.right != null) queue.offer(tmp.right);
//            for (int i = 0; i < len - 1; i++) {
//                tmp = queue.poll();
//                if (tmp.left != null) queue.offer(tmp.left);
//                if (tmp.right != null) queue.offer(tmp.right);
//            }
//        }
//        return res;
//    }
    int maxdepth = Integer.MIN_VALUE;
    int res = 0;
    public int findBottomLeftValue(TreeNode root) {
        traversal(root,0);
        return res;
    }
    public void traversal(TreeNode root,int depth){
        if (root.left == null && root.right == null){
            if (depth > maxdepth){
                maxdepth = depth;
                res  = root.val;
            }
            return;
        }

        if (root.left != null){
            depth++;
            traversal(root.left,depth);
            depth--;
        }

        if (root.right != null){
            depth++;
            traversal(root.right, depth);
            depth--;
        }
        return;
    }
}
