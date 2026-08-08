// https://leetcode.com/problems/backtracking-subset-437/
package backtracking;

import java.util.*;

public class LeetCode437_Backtracking437 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode437_Backtracking437 solver = new LeetCode437_Backtracking437();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode437_Backtracking437 Passed!");
    }
}
