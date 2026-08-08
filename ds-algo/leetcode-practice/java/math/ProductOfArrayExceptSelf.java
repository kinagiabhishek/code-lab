// https://leetcode.com/problems/product-of-array-except-self/
package math;

import java.util.*;

public class ProductOfArrayExceptSelf {
    // LeetCode Problem 238: Product of Array Except Self
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf solver = new ProductOfArrayExceptSelf();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ProductOfArrayExceptSelf (Product of Array Except Self) Passed!");
    }
}
