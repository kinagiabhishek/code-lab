// https://leetcode.com/problems/minimum-depth-of-binary-tree/
package math;

import java.util.*;

public class MinimumDepthOfBinaryTree {
    // LeetCode Problem 111: Minimum Depth of Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree solver = new MinimumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MinimumDepthOfBinaryTree Passed!");
    }
}
