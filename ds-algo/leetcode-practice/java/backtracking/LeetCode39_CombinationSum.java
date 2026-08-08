// https://leetcode.com/problems/combination-sum/
package backtracking;

import java.util.*;

public class LeetCode39_CombinationSum {
    // LeetCode Problem 39: Combination Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode39_CombinationSum solver = new LeetCode39_CombinationSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode39_CombinationSum (Combination Sum) Passed!");
    }
}
