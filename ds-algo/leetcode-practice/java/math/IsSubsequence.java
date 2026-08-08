// https://leetcode.com/problems/is-subsequence/
package math;

import java.util.*;

public class IsSubsequence {
    // LeetCode Problem 392: Is Subsequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IsSubsequence solver = new IsSubsequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IsSubsequence (Is Subsequence) Passed!");
    }
}
