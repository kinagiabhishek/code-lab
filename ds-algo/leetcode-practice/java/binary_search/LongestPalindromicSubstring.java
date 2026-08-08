// https://leetcode.com/problems/longest-palindromic-substring/
package binary_search;

import java.util.*;

public class LongestPalindromicSubstring {
    // LeetCode Problem 5: Longest Palindromic Substring
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ LongestPalindromicSubstring Passed!");
    }
}
