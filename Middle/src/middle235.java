public class middle235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traversal(root,p,q);
    }

    private TreeNode traversal(TreeNode cur,TreeNode p,TreeNode q){
        if (cur == null) return cur;

        if (cur.val > p.val && cur.val > q.val){
            TreeNode left = traversal(cur.left,p,q);
            if (left != null){
                return left;
            }
        }

        if (cur.val < p.val && cur.val < q.val){
            TreeNode right = traversal(cur.right,p,q);
            if (right != null){
                return right;
            }
        }

        return cur;
    }
}
