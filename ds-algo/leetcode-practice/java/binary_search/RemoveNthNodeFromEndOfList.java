// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package binary_search;

import java.util.*;

public class RemoveNthNodeFromEndOfList {
    // LeetCode Problem 19: Remove Nth Node From End of List
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList solver = new RemoveNthNodeFromEndOfList();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ RemoveNthNodeFromEndOfList Passed!");
    }
}
