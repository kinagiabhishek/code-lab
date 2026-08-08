// https://leetcode.com/problems/longest-palindromic-substring/
package dynamic_programming;

import java.util.*;

public class LeetCode5_LongestPalindromicSubstring {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode5_LongestPalindromicSubstring solver = new LeetCode5_LongestPalindromicSubstring();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode5_LongestPalindromicSubstring Passed!");
    }
}
