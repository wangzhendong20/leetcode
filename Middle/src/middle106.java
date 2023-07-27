import java.util.HashMap;
import java.util.Map;

public class middle106 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return findNode(inorder,0,inorder.length,postorder,0,postorder.length);
    }

    private TreeNode findNode(int[] inorder,int inbegin,int inEnd,int[] postorder, int postbegin, int postend){
        if (inbegin >= inEnd || postbegin >= postend) return null;
        int rootIndex = map.get(postorder[postend-1]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        int lenOfLeft = rootIndex - inbegin;
        root.left = findNode(inorder,inbegin,rootIndex,postorder,postbegin,postbegin+lenOfLeft);
        root.right = findNode(inorder,rootIndex+1,inEnd,postorder,postbegin+lenOfLeft,postend-1);

        return root;
    }
}
