public class hard968 {

    private int res = 0;
    public int minCameraCover(TreeNode root) {
        if (traversal(root) == 0){
            res++;
        }
        return res;

    }

    private int traversal(TreeNode cur){
        if (cur == null) return 2;

        int left = traversal(cur.left);
        int right = traversal(cur.right);

        if (left == 2 && right == 2) return 0;

        if (left == 0 || right == 0){
            res++;
            return 1;
        }

        if (left == 1 || right == 1) return 2;

        return -1;
    }
}
