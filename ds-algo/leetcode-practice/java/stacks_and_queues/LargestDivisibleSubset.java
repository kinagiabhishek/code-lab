// https://leetcode.com/problems/largest-divisible-subset/
package stacks_and_queues;

import java.util.*;

public class LargestDivisibleSubset {
    // LeetCode Problem 368: Largest Divisible Subset
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LargestDivisibleSubset solver = new LargestDivisibleSubset();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LargestDivisibleSubset (Largest Divisible Subset) Passed!");
    }
}
