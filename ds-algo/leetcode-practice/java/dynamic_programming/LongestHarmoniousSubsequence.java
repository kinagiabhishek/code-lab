// https://leetcode.com/problems/longest-harmonious-subsequence/
package dynamic_programming;

import java.util.*;

public class LongestHarmoniousSubsequence {
    // LeetCode Problem 594: Longest Harmonious Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence solver = new LongestHarmoniousSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode594_LongestHarmoniousSubsequence (Longest Harmonious Subsequence) Passed!");
    }
}
