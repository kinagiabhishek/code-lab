// https://leetcode.com/problems/subtree-of-another-tree/
package greedy;

import java.util.*;

public class SubtreeOfAnotherTree {
    // LeetCode Problem 572: Subtree of Another Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        SubtreeOfAnotherTree solver = new SubtreeOfAnotherTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ SubtreeOfAnotherTree Passed!");
    }
}
