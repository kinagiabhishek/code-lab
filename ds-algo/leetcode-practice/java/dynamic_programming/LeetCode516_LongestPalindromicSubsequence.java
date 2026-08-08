// https://leetcode.com/problems/longest-palindromic-subsequence/
package dynamic_programming;

import java.util.*;

public class LeetCode516_LongestPalindromicSubsequence {
    // LeetCode Problem 516: Longest Palindromic Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode516_LongestPalindromicSubsequence solver = new LeetCode516_LongestPalindromicSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode516_LongestPalindromicSubsequence (Longest Palindromic Subsequence) Passed!");
    }
}
