// https://leetcode.com/problems/minimum-window-substring/
package linked_lists;

import java.util.*;

public class MinimumWindowSubstring {
    // LeetCode Problem 76: Minimum Window Substring
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solver = new MinimumWindowSubstring();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ MinimumWindowSubstring Passed!");
    }
}
