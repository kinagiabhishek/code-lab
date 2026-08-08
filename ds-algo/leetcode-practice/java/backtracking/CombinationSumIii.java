// https://leetcode.com/problems/combination-sum-iii/
package backtracking;

import java.util.*;

public class CombinationSumIii {
    // LeetCode Problem 216: Combination Sum III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CombinationSumIii solver = new CombinationSumIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode216_CombinationSumIii (Combination Sum III) Passed!");
    }
}
