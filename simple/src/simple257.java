import java.util.ArrayList;
import java.util.List;

public class simple257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        List<Integer> path = new ArrayList<>();
        traversal(root,path,res);
        return res;
    }
    private void traversal(TreeNode cur,List<Integer> path, List<String> result){
        path.add(cur.val);
        if (cur.left == null && cur.right == null){
            StringBuffer sPath = new StringBuffer();
            for (int i = 0; i < path.size() - 1; i++) {
                sPath.append(path.get(i)).append("->");
            }
            sPath.append(path.get(path.size()-1));
            result.add(sPath.toString());
            return;
        }
        if (cur.left!=null){
            traversal(cur.left,path,result);
            path.remove(path.size()-1);
        }
        if (cur.right!=null){
            traversal(cur.right,path,result);
            path.remove(path.size()-1);
        }
    }
}
