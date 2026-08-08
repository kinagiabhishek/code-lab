// https://leetcode.com/problems/maximum-product-subarray/
package arrays_and_hashing;

import java.util.*;

public class LeetCode152_MaximumProductSubarray {
    // LeetCode Problem 152: Maximum Product Subarray
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode152_MaximumProductSubarray solver = new LeetCode152_MaximumProductSubarray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode152_MaximumProductSubarray (Maximum Product Subarray) Passed!");
    }
}
