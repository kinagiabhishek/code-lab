// https://leetcode.com/problems/binary-tree-maximum-path-sum/
package trees;
public class BinaryTreeMaxPathSum {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    private int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) { maxGain(root); return maxSum; }
    private int maxGain(TreeNode node) {
        if (node == null) return 0;
        int leftGain = Math.max(maxGain(node.left), 0), rightGain = Math.max(maxGain(node.right), 0);
        maxSum = Math.max(maxSum, node.val + leftGain + rightGain);
        return node.val + Math.max(leftGain, rightGain);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2); root.right = new TreeNode(3);
        assert new BinaryTreeMaxPathSum().maxPathSum(root) == 6;
        System.out.println("✅ LeetCode124_BinaryTreeMaxPathSum Passed!");
    }
}
