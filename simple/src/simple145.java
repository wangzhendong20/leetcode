import java.util.*;

public class simple145 {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        postorder(root,res);
//        return res;
//    }
//
//    public void postorder(TreeNode root, List<Integer> res){
//        if (root == null){
//            return;
//        }
//        postorder(root.left,res);
//        postorder(root.right,res);
//        res.add(root.val);
//
//    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return res;
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.peek();
            stack.pop();
            res.add(node.val);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);

        }
        Collections.reverse(res);
        return res;
    }
}
