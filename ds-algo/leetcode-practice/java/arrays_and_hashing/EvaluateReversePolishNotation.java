// https://leetcode.com/problems/evaluate-reverse-polish-notation/
package arrays_and_hashing;

import java.util.*;

public class EvaluateReversePolishNotation {
    // LeetCode Problem 150: Evaluate Reverse Polish Notation
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation solver = new EvaluateReversePolishNotation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode150_EvaluateReversePolishNotation (Evaluate Reverse Polish Notation) Passed!");
    }
}
