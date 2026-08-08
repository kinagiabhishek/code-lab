// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
package math;

import java.util.*;

public class MaximumDepthOfNaryTree {
    // LeetCode Problem 559: Maximum Depth of N-ary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaximumDepthOfNaryTree solver = new MaximumDepthOfNaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MaximumDepthOfNaryTree Passed!");
    }
}
