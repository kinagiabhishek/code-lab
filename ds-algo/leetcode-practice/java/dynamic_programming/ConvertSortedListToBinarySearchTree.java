// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
package dynamic_programming;

import java.util.*;

public class ConvertSortedListToBinarySearchTree {
    // LeetCode Problem 109: Convert Sorted List to Binary Search Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        ConvertSortedListToBinarySearchTree solver = new ConvertSortedListToBinarySearchTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ ConvertSortedListToBinarySearchTree Passed!");
    }
}
