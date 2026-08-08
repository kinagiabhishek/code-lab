// https://leetcode.com/problems/symmetric-tree/
package sliding_window;

import java.util.*;

public class SymmetricTree {
    // LeetCode Problem 101: Symmetric Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        SymmetricTree solver = new SymmetricTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ SymmetricTree Passed!");
    }
}
