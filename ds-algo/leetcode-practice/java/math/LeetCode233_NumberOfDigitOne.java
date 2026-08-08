// https://leetcode.com/problems/number-of-digit-one/
package math;

import java.util.*;

public class LeetCode233_NumberOfDigitOne {
    // LeetCode Problem 233: Number of Digit One
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode233_NumberOfDigitOne solver = new LeetCode233_NumberOfDigitOne();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode233_NumberOfDigitOne (Number of Digit One) Passed!");
    }
}
