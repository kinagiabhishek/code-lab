// https://leetcode.com/problems/validate-binary-search-tree/
package trees;
public class LeetCode98_ValidateBinarySearchTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isValidBST(TreeNode root) { return validate(root, null, null); }
    private boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2); root.left = new TreeNode(1); root.right = new TreeNode(3);
        assert new LeetCode98_ValidateBinarySearchTree().isValidBST(root) == true;
        System.out.println("✅ LeetCode98_ValidateBinarySearchTree Passed!");
    }
}
