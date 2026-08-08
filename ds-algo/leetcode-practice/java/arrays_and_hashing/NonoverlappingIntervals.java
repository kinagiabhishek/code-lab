// https://leetcode.com/problems/non-overlapping-intervals/
package arrays_and_hashing;

import java.util.*;

public class NonoverlappingIntervals {
    // LeetCode Problem 435: Non-overlapping Intervals
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        NonoverlappingIntervals solver = new NonoverlappingIntervals();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ NonoverlappingIntervals Passed!");
    }
}
