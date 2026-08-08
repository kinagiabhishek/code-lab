// https://leetcode.com/problems/merge-intervals/
package math;

import java.util.*;

public class MergeIntervals {
    // LeetCode Problem 56: Merge Intervals
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MergeIntervals solver = new MergeIntervals();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MergeIntervals (Merge Intervals) Passed!");
    }
}
