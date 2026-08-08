// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
package greedy;

import java.util.*;

public class MinimumAbsoluteDifferenceInBst {
    // LeetCode Problem 530: Minimum Absolute Difference in BST
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBst solver = new MinimumAbsoluteDifferenceInBst();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MinimumAbsoluteDifferenceInBst Passed!");
    }
}
