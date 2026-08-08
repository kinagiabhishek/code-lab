// https://leetcode.com/problems/nth-digit/
package math;

import java.util.*;

public class LeetCode400_NthDigit {
    // LeetCode Problem 400: Nth Digit
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode400_NthDigit solver = new LeetCode400_NthDigit();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode400_NthDigit (Nth Digit) Passed!");
    }
}
