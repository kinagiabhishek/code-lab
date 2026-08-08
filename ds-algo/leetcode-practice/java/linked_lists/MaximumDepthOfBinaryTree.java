// https://leetcode.com/problems/maximum-depth-of-binary-tree/
package linked_lists;

import java.util.*;

public class MaximumDepthOfBinaryTree {
    // LeetCode Problem 104: Maximum Depth of Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree solver = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MaximumDepthOfBinaryTree Passed!");
    }
}
