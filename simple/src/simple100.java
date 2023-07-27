public class simple100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compare(p,q);
    }

    private boolean compare(TreeNode left, TreeNode right){
        if (left == null && right != null) return false;
        else if (left != null && right == null) return false;
        else if (left == null && right == null) return true;
        else if(left.val != right.val) return false;

        boolean leftcm = compare(left.left, right.left);
        boolean rightcm = compare(left.right,right.right);
        boolean isSame = leftcm && rightcm;
        return isSame;
    }
}
