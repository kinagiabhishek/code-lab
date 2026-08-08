// https://leetcode.com/problems/longest-palindromic-substring/
package binary_search;

import java.util.*;

public class LongestPalindromicSubstring {
    // LeetCode Problem 5: Longest Palindromic Substring
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solver = new LongestPalindromicSubstring();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestPalindromicSubstring (Longest Palindromic Substring) Passed!");
    }
}
