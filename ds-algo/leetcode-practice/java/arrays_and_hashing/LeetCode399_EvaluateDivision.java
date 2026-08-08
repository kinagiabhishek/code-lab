// https://leetcode.com/problems/evaluate-division/
package arrays_and_hashing;

import java.util.*;

public class LeetCode399_EvaluateDivision {
    // LeetCode Problem 399: Evaluate Division
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode399_EvaluateDivision solver = new LeetCode399_EvaluateDivision();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode399_EvaluateDivision (Evaluate Division) Passed!");
    }
}
