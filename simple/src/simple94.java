import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class simple94 {
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        inorder(root,res);
//        return res;
//    }
//
//    public void inorder(TreeNode root, List<Integer> res){
//        if (root == null){
//            return;
//        }
//        inorder(root.left,res);
//        res.add(root.val);
//        inorder(root.right,res);
//    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()){
            if (node != null){
                stack.push(node);
                node = node.left;
            }else {
                node = stack.peek();
                stack.pop();
                res.add(node.val);
                node = node.right;
            }
        }
        return res;
    }
}
