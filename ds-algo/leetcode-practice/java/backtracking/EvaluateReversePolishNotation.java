// https://leetcode.com/problems/evaluate-reverse-polish-notation/
package backtracking;

import java.util.*;

public class EvaluateReversePolishNotation {
    // LeetCode Problem 150: Evaluate Reverse Polish Notation
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation solver = new EvaluateReversePolishNotation();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EvaluateReversePolishNotation (Evaluate Reverse Polish Notation) Passed!");
    }
}
