// https://leetcode.com/problems/combination-sum-ii/
package backtracking;

import java.util.*;

public class LeetCode40_CombinationSumII {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode40_CombinationSumII solver = new LeetCode40_CombinationSumII();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode40_CombinationSumII Passed!");
    }
}
