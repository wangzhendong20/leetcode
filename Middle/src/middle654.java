import java.util.Arrays;

public class middle654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums,0,nums.length);
    }

    private TreeNode traversal(int[] nums,int left, int right){
        if (left >= right) return null;
        int maxValueIndex = left;

        for (int i = left + 1; i < right; i++) {
            if (nums[i] > nums[maxValueIndex]) maxValueIndex = i;
        }

        TreeNode node = new TreeNode(nums[maxValueIndex]);
        node.left = traversal(nums,left,maxValueIndex);
        node.right = traversal(nums,maxValueIndex+1,right);

        return node;
    }
}
