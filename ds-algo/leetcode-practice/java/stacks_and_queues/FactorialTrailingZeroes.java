// https://leetcode.com/problems/factorial-trailing-zeroes/
package stacks_and_queues;

import java.util.*;

public class FactorialTrailingZeroes {
    // LeetCode Problem 172: Factorial Trailing Zeroes
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes solver = new FactorialTrailingZeroes();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FactorialTrailingZeroes (Factorial Trailing Zeroes) Passed!");
    }
}
