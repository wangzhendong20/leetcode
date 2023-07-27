import java.util.LinkedList;
import java.util.Queue;

public class simple104 {
//    public int maxDepth(TreeNode root) {
//        int level = 0;
//        if (root == null) return level;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()){
//            int len = queue.size();
//            for (int i = 0; i < len; i++) {
//                TreeNode tmp = queue.poll();
//                if (tmp.left != null) queue.offer(tmp.left);
//                if (tmp.right != null) queue.offer(tmp.right);
//            }
//            level++;
//        }
//        return level;
//    }

    public int countNodes(TreeNode root) {
        return getNodesNum(root);
    }
    private int getNodesNum(TreeNode cur){
        if (cur == null) return 0;
        int leftNum = getNodesNum(cur.left);
        int rightNum = getNodesNum(cur.right);
        int treeNum = leftNum + rightNum + 1;
        return treeNum;
    }

}
