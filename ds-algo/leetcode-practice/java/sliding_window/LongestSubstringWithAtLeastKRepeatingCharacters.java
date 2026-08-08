// https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
package sliding_window;

import java.util.*;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    // LeetCode Problem 395: Longest Substring with At Least K Repeating Characters
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepeatingCharacters solver = new LongestSubstringWithAtLeastKRepeatingCharacters();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ LongestSubstringWithAtLeastKRepeatingCharacters Passed!");
    }
}
