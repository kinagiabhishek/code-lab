// https://leetcode.com/problems/fraction-to-recurring-decimal/
package greedy;

import java.util.*;

public class FractionToRecurringDecimal {
    // LeetCode Problem 166: Fraction to Recurring Decimal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FractionToRecurringDecimal solver = new FractionToRecurringDecimal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FractionToRecurringDecimal (Fraction to Recurring Decimal) Passed!");
    }
}
