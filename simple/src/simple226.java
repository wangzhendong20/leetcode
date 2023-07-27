import java.util.Stack;

public class simple226 {
//    public TreeNode invertTree(TreeNode root) {
//        //∫Û–Ú±È¿˙µ›πÈ
//        if (root == null) return null;
//        invertTree(root.left);
//        invertTree(root.right);
//        swapChildren(root);
//        return root;
//    }
//    public TreeNode invertTree(TreeNode root) {
//        //«∞–Ú±È¿˙µ›πÈ
//        if (root == null) return null;
//        swapChildren(root);
//        invertTree(root.left);
//        invertTree(root.right);
//        return root;
//    }

    private void swapChildren(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode tmpNode = stack.peek();
            if (tmpNode != null){
                stack.pop();
                if (tmpNode.right != null) stack.push(tmpNode.right);
                if (tmpNode.left != null) stack.push(tmpNode.left);
                stack.push(tmpNode);
                stack.push(null);
            }else {
                stack.pop();
                tmpNode = stack.peek();
                stack.pop();
                swapChildren(tmpNode);
            }
        }
        return root;
    }

}
