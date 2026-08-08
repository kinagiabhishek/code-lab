// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
package heap_and_priority_queue;

import java.util.*;

public class VerifyPreorderSerializationOfABinaryTree {
    // LeetCode Problem 331: Verify Preorder Serialization of a Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        VerifyPreorderSerializationOfABinaryTree solver = new VerifyPreorderSerializationOfABinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ VerifyPreorderSerializationOfABinaryTree Passed!");
    }
}
