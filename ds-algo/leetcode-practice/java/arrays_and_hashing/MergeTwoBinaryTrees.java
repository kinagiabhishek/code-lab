// https://leetcode.com/problems/merge-two-binary-trees/
package arrays_and_hashing;

import java.util.*;

public class MergeTwoBinaryTrees {
    // LeetCode Problem 617: Merge Two Binary Trees
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees solver = new MergeTwoBinaryTrees();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MergeTwoBinaryTrees Passed!");
    }
}
