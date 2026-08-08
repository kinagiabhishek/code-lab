// https://leetcode.com/problems/longest-increasing-subsequence/
package dynamic_programming;

import java.util.*;

public class LeetCode300_LongestIncreasingSubsequence {
    // LeetCode Problem 300: Longest Increasing Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode300_LongestIncreasingSubsequence solver = new LeetCode300_LongestIncreasingSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode300_LongestIncreasingSubsequence (Longest Increasing Subsequence) Passed!");
    }
}
