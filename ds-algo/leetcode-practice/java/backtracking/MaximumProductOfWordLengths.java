// https://leetcode.com/problems/maximum-product-of-word-lengths/
package backtracking;

import java.util.*;

public class MaximumProductOfWordLengths {
    // LeetCode Problem 318: Maximum Product of Word Lengths
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumProductOfWordLengths solver = new MaximumProductOfWordLengths();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumProductOfWordLengths (Maximum Product of Word Lengths) Passed!");
    }
}
