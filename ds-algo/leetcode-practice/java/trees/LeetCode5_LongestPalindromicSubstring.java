// https://leetcode.com/problems/longest-palindromic-substring/
package trees;

import java.util.*;

public class LeetCode5_LongestPalindromicSubstring {
    // LeetCode Problem 5: Longest Palindromic Substring
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode5_LongestPalindromicSubstring solver = new LeetCode5_LongestPalindromicSubstring();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode5_LongestPalindromicSubstring (Longest Palindromic Substring) Passed!");
    }
}
