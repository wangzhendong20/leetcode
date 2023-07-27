import java.util.HashMap;
import java.util.Map;

public class middle105 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return findNode(preorder,0,preorder.length,inorder,0,inorder.length);
    }

    private TreeNode findNode(int[] preorder,int preBegin, int preEnd,int[] inorder,int inBegin, int inEnd){
        if (preBegin >= preEnd || inBegin >= inEnd) return null;
        int rootIndex = map.get(preorder[preBegin]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        int lenOfleft = rootIndex - inBegin;
        root.left = findNode(preorder,preBegin+1,preBegin+1+lenOfleft,inorder,inBegin,rootIndex);
        root.right = findNode(preorder,preBegin+1+lenOfleft,preEnd,inorder,rootIndex+1,inEnd);

        return root;
    }
}
