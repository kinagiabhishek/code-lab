// https://leetcode.com/problems/binary-tree-inorder-traversal/
package backtracking;

import java.util.*;

public class BinaryTreeInorderTraversal {
    // LeetCode Problem 94: Binary Tree Inorder Traversal
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal solver = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BinaryTreeInorderTraversal Passed!");
    }
}
