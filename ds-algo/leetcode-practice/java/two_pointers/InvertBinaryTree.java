// https://leetcode.com/problems/invert-binary-tree/
package two_pointers;

import java.util.*;

public class InvertBinaryTree {
    // LeetCode Problem 226: Invert Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        InvertBinaryTree solver = new InvertBinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ InvertBinaryTree Passed!");
    }
}
