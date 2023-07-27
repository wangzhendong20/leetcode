public class simple572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null) return false;
        return isSame(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    private boolean isSame(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        } else if (a.val != b.val) {
            return false;
        } else {
            return isSame(a.left, b.left) && isSame(a.right, b.right);
        }
    }

}
