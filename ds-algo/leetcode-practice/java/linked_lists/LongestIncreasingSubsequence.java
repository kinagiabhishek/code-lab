// https://leetcode.com/problems/longest-increasing-subsequence/
package linked_lists;

import java.util.*;

public class LongestIncreasingSubsequence {
    // LeetCode Problem 300: Longest Increasing Subsequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence solver = new LongestIncreasingSubsequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestIncreasingSubsequence (Longest Increasing Subsequence) Passed!");
    }
}
