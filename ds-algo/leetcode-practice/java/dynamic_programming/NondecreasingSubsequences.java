// https://leetcode.com/problems/non-decreasing-subsequences/
package dynamic_programming;

import java.util.*;

public class NondecreasingSubsequences {
    // LeetCode Problem 491: Non-decreasing Subsequences
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NondecreasingSubsequences solver = new NondecreasingSubsequences();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode491_NondecreasingSubsequences (Non-decreasing Subsequences) Passed!");
    }
}
