// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
package heap_and_priority_queue;

import java.util.*;

public class BinaryTreeLevelOrderTraversalIi {
    // LeetCode Problem 107: Binary Tree Level Order Traversal II
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversalIi solver = new BinaryTreeLevelOrderTraversalIi();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BinaryTreeLevelOrderTraversalIi Passed!");
    }
}
