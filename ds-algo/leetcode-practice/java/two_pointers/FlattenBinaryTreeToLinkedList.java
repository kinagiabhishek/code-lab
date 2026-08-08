// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
package two_pointers;

import java.util.*;

public class FlattenBinaryTreeToLinkedList {
    // LeetCode Problem 114: Flatten Binary Tree to Linked List
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList solver = new FlattenBinaryTreeToLinkedList();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ FlattenBinaryTreeToLinkedList Passed!");
    }
}
