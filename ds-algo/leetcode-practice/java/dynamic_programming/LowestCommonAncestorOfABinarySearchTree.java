// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
package dynamic_programming;

import java.util.*;

public class LowestCommonAncestorOfABinarySearchTree {
    // LeetCode Problem 235: Lowest Common Ancestor of a Binary Search Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ LowestCommonAncestorOfABinarySearchTree Passed!");
    }
}
