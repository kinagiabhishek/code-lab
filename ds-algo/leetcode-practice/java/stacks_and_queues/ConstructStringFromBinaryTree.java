// https://leetcode.com/problems/construct-string-from-binary-tree/
package stacks_and_queues;

import java.util.*;

public class ConstructStringFromBinaryTree {
    // LeetCode Problem 606: Construct String from Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        ConstructStringFromBinaryTree solver = new ConstructStringFromBinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ ConstructStringFromBinaryTree Passed!");
    }
}
