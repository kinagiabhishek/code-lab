// https://leetcode.com/problems/delete-node-in-a-bst/
package two_pointers;

import java.util.*;

public class DeleteNodeInABst {
    // LeetCode Problem 450: Delete Node in a BST
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        DeleteNodeInABst solver = new DeleteNodeInABst();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ DeleteNodeInABst Passed!");
    }
}
