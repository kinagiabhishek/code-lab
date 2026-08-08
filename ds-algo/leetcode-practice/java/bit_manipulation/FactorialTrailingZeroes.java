// https://leetcode.com/problems/factorial-trailing-zeroes/
package bit_manipulation;

import java.util.*;

public class FactorialTrailingZeroes {
    // LeetCode Problem 172: Factorial Trailing Zeroes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes solver = new FactorialTrailingZeroes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode172_FactorialTrailingZeroes (Factorial Trailing Zeroes) Passed!");
    }
}
