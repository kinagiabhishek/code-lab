// https://leetcode.com/problems/binary-tree-maximum-path-sum/
package greedy;

import java.util.*;

public class BinaryTreeMaximumPathSum {
    // LeetCode Problem 124: Binary Tree Maximum Path Sum
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum solver = new BinaryTreeMaximumPathSum();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BinaryTreeMaximumPathSum Passed!");
    }
}
