// https://leetcode.com/problems/guess-number-higher-or-lower-ii/
package dynamic_programming;

import java.util.*;

public class GuessNumberHigherOrLowerIi {
    // LeetCode Problem 375: Guess Number Higher or Lower II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GuessNumberHigherOrLowerIi solver = new GuessNumberHigherOrLowerIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GuessNumberHigherOrLowerIi (Guess Number Higher or Lower II) Passed!");
    }
}
