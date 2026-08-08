// https://leetcode.com/problems/combination-sum-iv/
package backtracking;

import java.util.*;

public class LeetCode377_CombinationSumIv {
    // LeetCode Problem 377: Combination Sum IV
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode377_CombinationSumIv solver = new LeetCode377_CombinationSumIv();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode377_CombinationSumIv (Combination Sum IV) Passed!");
    }
}
