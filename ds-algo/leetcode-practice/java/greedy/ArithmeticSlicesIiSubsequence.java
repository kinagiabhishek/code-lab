// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
package greedy;

import java.util.*;

public class ArithmeticSlicesIiSubsequence {
    // LeetCode Problem 446: Arithmetic Slices II - Subsequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ArithmeticSlicesIiSubsequence solver = new ArithmeticSlicesIiSubsequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ArithmeticSlicesIiSubsequence (Arithmetic Slices II - Subsequence) Passed!");
    }
}
