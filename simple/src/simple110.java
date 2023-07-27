public class simple110 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) == -1 ? false : true;
        }
        private int getHeight(TreeNode node){
            if (node == null) return 0;
            int leftHeight = getHeight(node.left);
            if (leftHeight == -1) return -1;
            int rightHeight = getHeight(node.right);
            if (rightHeight == -1) return -1;
            if (Math.abs(leftHeight-rightHeight) > 1){
                return -1;
            }else {
                return Math.max(leftHeight,rightHeight) + 1;
            }
        }
    }
}
