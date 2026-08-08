// https://leetcode.com/problems/subtree-of-another-tree/
package trees;
public class LeetCode572_SubtreeOfAnotherTree {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); root.left = new TreeNode(4); root.right = new TreeNode(5);
        TreeNode sub = new TreeNode(4);
        assert new LeetCode572_SubtreeOfAnotherTree().isSubtree(root, sub) == true;
        System.out.println("✅ LeetCode572_SubtreeOfAnotherTree Passed!");
    }
}
