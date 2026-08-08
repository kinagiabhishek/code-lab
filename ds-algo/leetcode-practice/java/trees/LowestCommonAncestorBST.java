// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
package trees;
public class LowestCommonAncestorBST {
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6); root.left = new TreeNode(2); root.right = new TreeNode(8);
        assert new LowestCommonAncestorBST().lowestCommonAncestor(root, root.left, root.right).val == 6;
        System.out.println("✅ LeetCode235_LowestCommonAncestorBST Passed!");
    }
}
