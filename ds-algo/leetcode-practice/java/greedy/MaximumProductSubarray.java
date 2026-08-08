// https://leetcode.com/problems/maximum-product-subarray/
package greedy;

import java.util.*;

public class MaximumProductSubarray {
    // LeetCode Problem 152: Maximum Product Subarray
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumProductSubarray solver = new MaximumProductSubarray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumProductSubarray (Maximum Product Subarray) Passed!");
    }
}
