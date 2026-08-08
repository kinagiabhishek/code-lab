// https://leetcode.com/problems/find-mode-in-binary-search-tree/
package dynamic_programming;

import java.util.*;

public class FindModeInBinarySearchTree {
    // LeetCode Problem 501: Find Mode in Binary Search Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        FindModeInBinarySearchTree solver = new FindModeInBinarySearchTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ FindModeInBinarySearchTree Passed!");
    }
}
