import java.util.LinkedList;
import java.util.Queue;

public class simple101 {
//    public boolean isSymmetric(TreeNode root) {
//        if (root == null) return true;
//        return compare(root.left,root.right);
//    }
//
//    private boolean compare(TreeNode left, TreeNode right){
//        if (left == null && right != null) return false;
//        else if (left != null && right == null) return false;
//        else if (left == null && right == null) return true;
//        else if (left.val != right.val) return false;
//
//        boolean outside = compare(left.left,right.right);
//        boolean inside = compare(left.right,right.left);
//        boolean isSame = outside && inside;
//        return isSame;
//    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null){
                continue;
            }
            if (left == null && right!=null || left!=null && right==null || left.val != right.val){
                return false;
            }
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }
}
