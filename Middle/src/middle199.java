import java.util.*;

public class middle199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);
        while (!deque.isEmpty()){
            int levelSize = deque.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode tmpNode = deque.pollFirst();
                if (tmpNode.left != null) deque.offerLast(tmpNode.left);
                if (tmpNode.right != null) deque.offerLast(tmpNode.right);
                if (i == levelSize - 1){
                    res.add(tmpNode.val);
                }
            }
        }
        return res;
    }
}
