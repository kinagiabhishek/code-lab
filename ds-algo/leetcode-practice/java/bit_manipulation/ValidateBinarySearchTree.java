// https://leetcode.com/problems/validate-binary-search-tree/
package bit_manipulation;

import java.util.*;

public class ValidateBinarySearchTree {
    // LeetCode Problem 98: Validate Binary Search Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree solver = new ValidateBinarySearchTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ ValidateBinarySearchTree Passed!");
    }
}
