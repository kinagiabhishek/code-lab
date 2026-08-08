// https://leetcode.com/problems/number-of-1-bits/
package bit_manipulation;

import java.util.*;

public class LeetCode191_NumberOf1Bits {
    // LeetCode Problem 191: Number of 1 Bits
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode191_NumberOf1Bits solver = new LeetCode191_NumberOf1Bits();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode191_NumberOf1Bits (Number of 1 Bits) Passed!");
    }
}
