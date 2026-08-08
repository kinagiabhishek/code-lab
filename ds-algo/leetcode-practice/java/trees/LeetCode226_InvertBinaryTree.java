// https://leetcode.com/problems/invert-binary-tree/
package trees;
public class LeetCode226_InvertBinaryTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left; root.left = invertTree(root.right); root.right = invertTree(temp);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4); root.left = new TreeNode(2); root.right = new TreeNode(7);
        assert new LeetCode226_InvertBinaryTree().invertTree(root).left.val == 7;
        System.out.println("✅ LeetCode226_InvertBinaryTree Passed!");
    }
}
