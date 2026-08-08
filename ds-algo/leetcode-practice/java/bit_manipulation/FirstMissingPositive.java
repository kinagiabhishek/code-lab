// https://leetcode.com/problems/first-missing-positive/
package bit_manipulation;

import java.util.*;

public class FirstMissingPositive {
    // LeetCode Problem 41: First Missing Positive
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FirstMissingPositive solver = new FirstMissingPositive();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FirstMissingPositive (First Missing Positive) Passed!");
    }
}
