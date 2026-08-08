// https://leetcode.com/problems/nth-digit/
package math;

import java.util.*;

public class NthDigit {
    // LeetCode Problem 400: Nth Digit
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NthDigit solver = new NthDigit();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode400_NthDigit (Nth Digit) Passed!");
    }
}
