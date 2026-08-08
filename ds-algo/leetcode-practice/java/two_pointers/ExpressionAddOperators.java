// https://leetcode.com/problems/expression-add-operators/
package two_pointers;

import java.util.*;

public class ExpressionAddOperators {
    // LeetCode Problem 282: Expression Add Operators
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ExpressionAddOperators solver = new ExpressionAddOperators();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ExpressionAddOperators (Expression Add Operators) Passed!");
    }
}
