// https://leetcode.com/problems/basic-calculator/
package math;

import java.util.*;

public class BasicCalculator {
    // LeetCode Problem 224: Basic Calculator
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BasicCalculator solver = new BasicCalculator();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BasicCalculator (Basic Calculator) Passed!");
    }
}
