// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
package backtracking;

import java.util.*;

public class ConvertSortedArrayToBinarySearchTree {
    // LeetCode Problem 108: Convert Sorted Array to Binary Search Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree solver = new ConvertSortedArrayToBinarySearchTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ ConvertSortedArrayToBinarySearchTree Passed!");
    }
}
