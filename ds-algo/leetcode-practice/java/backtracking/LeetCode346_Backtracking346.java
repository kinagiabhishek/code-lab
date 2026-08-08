// https://leetcode.com/problems/backtracking-subset-346/
package backtracking;

import java.util.*;

public class LeetCode346_Backtracking346 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode346_Backtracking346 solver = new LeetCode346_Backtracking346();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode346_Backtracking346 Passed!");
    }
}
