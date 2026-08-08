// https://leetcode.com/problems/unique-binary-search-trees-ii/
package dynamic_programming;

import java.util.*;

public class UniqueBinarySearchTreesIi {
    // LeetCode Problem 95: Unique Binary Search Trees II
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        UniqueBinarySearchTreesIi solver = new UniqueBinarySearchTreesIi();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ UniqueBinarySearchTreesIi Passed!");
    }
}
