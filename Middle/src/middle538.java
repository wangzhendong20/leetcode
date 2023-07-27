public class middle538 {
    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        return root;
    }

    int pre = 0;
    private void traversal(TreeNode root){
        if (root == null) return;
        traversal(root.right);
        root.val += pre;
        pre = root.val;
        traversal(root.left);
    }
}
