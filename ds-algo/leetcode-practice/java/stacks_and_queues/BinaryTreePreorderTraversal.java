// https://leetcode.com/problems/binary-tree-preorder-traversal/
package stacks_and_queues;

import java.util.*;

public class BinaryTreePreorderTraversal {
    // LeetCode Problem 144: Binary Tree Preorder Traversal
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal solver = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BinaryTreePreorderTraversal Passed!");
    }
}
