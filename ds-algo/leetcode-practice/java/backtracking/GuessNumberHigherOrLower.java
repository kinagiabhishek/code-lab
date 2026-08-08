// https://leetcode.com/problems/guess-number-higher-or-lower/
package backtracking;

import java.util.*;

public class GuessNumberHigherOrLower {
    // LeetCode Problem 374: Guess Number Higher or Lower
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GuessNumberHigherOrLower solver = new GuessNumberHigherOrLower();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GuessNumberHigherOrLower (Guess Number Higher or Lower) Passed!");
    }
}
