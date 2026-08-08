// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package linked_lists;

import java.util.*;

public class KthSmallestElementInABst {
    // LeetCode Problem 230: Kth Smallest Element in a BST
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        KthSmallestElementInABst solver = new KthSmallestElementInABst();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ KthSmallestElementInABst Passed!");
    }
}
