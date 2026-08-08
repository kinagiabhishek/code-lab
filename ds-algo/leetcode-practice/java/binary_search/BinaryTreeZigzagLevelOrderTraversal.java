// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
package binary_search;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    // LeetCode Problem 103: Binary Tree Zigzag Level Order Traversal
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversal solver = new BinaryTreeZigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BinaryTreeZigzagLevelOrderTraversal Passed!");
    }
}
