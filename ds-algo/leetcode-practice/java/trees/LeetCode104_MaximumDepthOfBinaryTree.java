// https://leetcode.com/problems/maximum-depth-of-binary-tree/
package trees;
public class LeetCode104_MaximumDepthOfBinaryTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(9); root.right = new TreeNode(20);
        assert new LeetCode104_MaximumDepthOfBinaryTree().maxDepth(root) == 2;
        System.out.println("✅ LeetCode104_MaximumDepthOfBinaryTree Passed!");
    }
}
