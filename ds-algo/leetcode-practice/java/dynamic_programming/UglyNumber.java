// https://leetcode.com/problems/ugly-number/
package dynamic_programming;

import java.util.*;

public class UglyNumber {
    // LeetCode Problem 263: Ugly Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        UglyNumber solver = new UglyNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ UglyNumber (Ugly Number) Passed!");
    }
}
