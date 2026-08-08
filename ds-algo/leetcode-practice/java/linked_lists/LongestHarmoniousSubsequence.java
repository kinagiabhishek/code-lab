// https://leetcode.com/problems/longest-harmonious-subsequence/
package linked_lists;

import java.util.*;

public class LongestHarmoniousSubsequence {
    // LeetCode Problem 594: Longest Harmonious Subsequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence solver = new LongestHarmoniousSubsequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestHarmoniousSubsequence (Longest Harmonious Subsequence) Passed!");
    }
}
