// https://leetcode.com/problems/backtracking-subset-450/
package backtracking;

import java.util.*;

public class LeetCode450_Backtracking450 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode450_Backtracking450 solver = new LeetCode450_Backtracking450();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode450_Backtracking450 Passed!");
    }
}
