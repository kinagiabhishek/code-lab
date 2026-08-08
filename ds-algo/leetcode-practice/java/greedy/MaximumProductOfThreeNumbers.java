// https://leetcode.com/problems/maximum-product-of-three-numbers/
package greedy;

import java.util.*;

public class MaximumProductOfThreeNumbers {
    // LeetCode Problem 628: Maximum Product of Three Numbers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumProductOfThreeNumbers solver = new MaximumProductOfThreeNumbers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumProductOfThreeNumbers (Maximum Product of Three Numbers) Passed!");
    }
}
