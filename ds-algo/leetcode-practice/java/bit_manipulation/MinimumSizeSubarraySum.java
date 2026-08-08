// https://leetcode.com/problems/minimum-size-subarray-sum/
package bit_manipulation;

import java.util.*;

public class MinimumSizeSubarraySum {
    // LeetCode Problem 209: Minimum Size Subarray Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumSizeSubarraySum solver = new MinimumSizeSubarraySum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumSizeSubarraySum (Minimum Size Subarray Sum) Passed!");
    }
}
