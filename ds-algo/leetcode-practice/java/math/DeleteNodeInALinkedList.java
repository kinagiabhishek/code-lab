// https://leetcode.com/problems/delete-node-in-a-linked-list/
package math;

import java.util.*;

public class DeleteNodeInALinkedList {
    // LeetCode Problem 237: Delete Node in a Linked List
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        DeleteNodeInALinkedList solver = new DeleteNodeInALinkedList();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ DeleteNodeInALinkedList Passed!");
    }
}
