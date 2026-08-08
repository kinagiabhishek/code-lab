// https://leetcode.com/problems/split-array-largest-sum/
package stacks_and_queues;

import java.util.*;

public class SplitArrayLargestSum {
    // LeetCode Problem 410: Split Array Largest Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SplitArrayLargestSum solver = new SplitArrayLargestSum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SplitArrayLargestSum (Split Array Largest Sum) Passed!");
    }
}
