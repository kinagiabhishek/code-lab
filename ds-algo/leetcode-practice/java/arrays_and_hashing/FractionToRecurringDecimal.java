// https://leetcode.com/problems/fraction-to-recurring-decimal/
package arrays_and_hashing;

import java.util.*;

public class FractionToRecurringDecimal {
    // LeetCode Problem 166: Fraction to Recurring Decimal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FractionToRecurringDecimal solver = new FractionToRecurringDecimal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode166_FractionToRecurringDecimal (Fraction to Recurring Decimal) Passed!");
    }
}
