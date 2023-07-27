import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class simple144 {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        preorder(root,res);
//        return res;
//    }
//
//    public void preorder(TreeNode root, List<Integer> res){
//        //�ݹ鷨
//        if (root == null){
//            return;
//        }
//        res.add(root.val);
//        preorder(root.left,res);
//        preorder(root.right,res);
//    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return res;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.peek();
            stack.pop();
            res.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;
    }
}
