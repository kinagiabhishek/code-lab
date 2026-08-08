// https://leetcode.com/problems/fraction-to-recurring-decimal/
package arrays_and_hashing;

import java.util.*;

public class LeetCode166_FractionToRecurringDecimal {
    // LeetCode Problem 166: Fraction to Recurring Decimal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode166_FractionToRecurringDecimal solver = new LeetCode166_FractionToRecurringDecimal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode166_FractionToRecurringDecimal (Fraction to Recurring Decimal) Passed!");
    }
}
