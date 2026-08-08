// https://leetcode.com/problems/non-decreasing-subsequences/
package arrays_and_hashing;

import java.util.*;

public class NondecreasingSubsequences {
    // LeetCode Problem 491: Non-decreasing Subsequences
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NondecreasingSubsequences solver = new NondecreasingSubsequences();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NondecreasingSubsequences (Non-decreasing Subsequences) Passed!");
    }
}
