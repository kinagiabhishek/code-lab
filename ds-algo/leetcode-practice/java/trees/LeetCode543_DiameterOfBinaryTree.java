// https://leetcode.com/problems/diameter-of-binary-tree/
package trees;
public class LeetCode543_DiameterOfBinaryTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root); return maxDiameter;
    }
    private int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left), right = depth(node.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2); root.right = new TreeNode(3);
        assert new LeetCode543_DiameterOfBinaryTree().diameterOfBinaryTree(root) == 2;
        System.out.println("✅ LeetCode543_DiameterOfBinaryTree Passed!");
    }
}
