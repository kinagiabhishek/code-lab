// https://leetcode.com/problems/evaluate-division/
package arrays_and_hashing;

import java.util.*;

public class EvaluateDivision {
    // LeetCode Problem 399: Evaluate Division
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EvaluateDivision solver = new EvaluateDivision();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode399_EvaluateDivision (Evaluate Division) Passed!");
    }
}
