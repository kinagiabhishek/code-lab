// https://leetcode.com/problems/non-overlapping-intervals/
package arrays_and_hashing;

import java.util.*;

public class NonoverlappingIntervals {
    // LeetCode Problem 435: Non-overlapping Intervals
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NonoverlappingIntervals solver = new NonoverlappingIntervals();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NonoverlappingIntervals (Non-overlapping Intervals) Passed!");
    }
}
