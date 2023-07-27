import java.util.ArrayList;
import java.util.List;

public class middle98 {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root,list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) >= list.get(i)){
                return false;
            }
        }
        return true;
    }

    private void traversal(TreeNode root,List<Integer> list){
        if (root == null) return;
        traversal(root.left,list);
        list.add(root.val);
        traversal(root.right,list);
    }
}
