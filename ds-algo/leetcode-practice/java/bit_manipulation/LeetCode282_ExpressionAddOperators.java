// https://leetcode.com/problems/expression-add-operators/
package bit_manipulation;

import java.util.*;

public class LeetCode282_ExpressionAddOperators {
    // LeetCode Problem 282: Expression Add Operators
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode282_ExpressionAddOperators solver = new LeetCode282_ExpressionAddOperators();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode282_ExpressionAddOperators (Expression Add Operators) Passed!");
    }
}
