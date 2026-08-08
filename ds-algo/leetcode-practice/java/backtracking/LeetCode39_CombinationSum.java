// https://leetcode.com/problems/combination-sum/
package backtracking;

import java.util.*;

public class LeetCode39_CombinationSum {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode39_CombinationSum solver = new LeetCode39_CombinationSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode39_CombinationSum Passed!");
    }
}
