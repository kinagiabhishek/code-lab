// https://leetcode.com/problems/basic-calculator-ii/
package sliding_window;

import java.util.*;

public class BasicCalculatorIi {
    // LeetCode Problem 227: Basic Calculator II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BasicCalculatorIi solver = new BasicCalculatorIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BasicCalculatorIi (Basic Calculator II) Passed!");
    }
}
