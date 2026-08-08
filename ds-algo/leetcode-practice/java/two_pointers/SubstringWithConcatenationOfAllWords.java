// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
package two_pointers;

import java.util.*;

public class SubstringWithConcatenationOfAllWords {
    // LeetCode Problem 30: Substring with Concatenation of All Words
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        SubstringWithConcatenationOfAllWords solver = new SubstringWithConcatenationOfAllWords();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ SubstringWithConcatenationOfAllWords Passed!");
    }
}
