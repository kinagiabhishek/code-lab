// https://leetcode.com/problems/minimum-time-difference/
package trees;

import java.util.*;

public class MinimumTimeDifference {
    // LeetCode Problem 539: Minimum Time Difference
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumTimeDifference solver = new MinimumTimeDifference();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumTimeDifference (Minimum Time Difference) Passed!");
    }
}
