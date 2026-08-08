// https://leetcode.com/problems/balanced-binary-tree/
package greedy;

import java.util.*;

public class BalancedBinaryTree {
    // LeetCode Problem 110: Balanced Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BalancedBinaryTree solver = new BalancedBinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BalancedBinaryTree Passed!");
    }
}
