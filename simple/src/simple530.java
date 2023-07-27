import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class simple530 {

//    public int getMinimumDifference(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        int minValue = Integer.MAX_VALUE;
//        traversal(root,list);
//        for (int i = 1; i < list.size(); i++) {
//            minValue = Math.min(minValue,list.get(i)-list.get(i-1));
//        }
//        return minValue;
//    }
//
//    private void traversal(TreeNode root, List<Integer> list){
//        if (root == null) return;
//        traversal(root.left,list);
//        list.add(root.val);
//        traversal(root.right,list);
//    }

    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return res;
    }

    int res = Integer.MAX_VALUE;
    TreeNode pre = null;
    private void traversal(TreeNode cur){
        if (cur == null) return;
        traversal(cur.left);
        if (pre != null){
            res = Math.min(res,cur.val - pre.val);
        }
        pre = cur;
        traversal(cur.right);
    }


}
