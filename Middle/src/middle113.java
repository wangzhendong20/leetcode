import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class middle113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> path = new LinkedList<>();
        traversal(root,targetSum-root.val,res,path);
        return res;
    }

    void traversal(TreeNode cur,int count, List<List<Integer>> res, List<Integer> path){
        path.add(cur.val);
        if (cur.left == null && cur.right == null){
            if (count - cur.val == 0){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        if (cur.left != null){
            traversal(cur.left,count-cur.val,res,path);
            path.remove(path.size()-1);
        }
        if (cur.right != null){
            traversal(cur.right,count-cur.val,res,path);
            path.remove(path.size()-1);
        }

    }
}
