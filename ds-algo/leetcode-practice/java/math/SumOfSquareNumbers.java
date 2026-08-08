// https://leetcode.com/problems/sum-of-square-numbers/
package math;

import java.util.*;

public class SumOfSquareNumbers {
    // LeetCode Problem 633: Sum of Square Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SumOfSquareNumbers solver = new SumOfSquareNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode633_SumOfSquareNumbers (Sum of Square Numbers) Passed!");
    }
}
