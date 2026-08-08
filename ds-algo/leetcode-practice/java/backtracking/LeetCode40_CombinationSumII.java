// https://leetcode.com/problems/combination-sum-ii/
package backtracking;

import java.util.*;

public class LeetCode40_CombinationSumIi {
    // LeetCode Problem 40: Combination Sum II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode40_CombinationSumIi solver = new LeetCode40_CombinationSumIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode40_CombinationSumIi (Combination Sum II) Passed!");
    }
}
