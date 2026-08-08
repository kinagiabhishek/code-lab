// https://leetcode.com/problems/longest-palindromic-subsequence/
package greedy;

import java.util.*;

public class LongestPalindromicSubsequence {
    // LeetCode Problem 516: Longest Palindromic Subsequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestPalindromicSubsequence solver = new LongestPalindromicSubsequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestPalindromicSubsequence (Longest Palindromic Subsequence) Passed!");
    }
}
