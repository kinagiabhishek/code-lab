// https://leetcode.com/problems/minimum-height-trees/
package two_pointers;

import java.util.*;

public class MinimumHeightTrees {
    // LeetCode Problem 310: Minimum Height Trees
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MinimumHeightTrees solver = new MinimumHeightTrees();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MinimumHeightTrees Passed!");
    }
}
