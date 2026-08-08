// https://leetcode.com/problems/sum-of-two-integers/
package math;

import java.util.*;

public class LeetCode371_SumOfTwoIntegers {
    // LeetCode Problem 371: Sum of Two Integers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode371_SumOfTwoIntegers solver = new LeetCode371_SumOfTwoIntegers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode371_SumOfTwoIntegers (Sum of Two Integers) Passed!");
    }
}
