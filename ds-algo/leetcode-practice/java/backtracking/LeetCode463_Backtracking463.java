// https://leetcode.com/problems/backtracking-subset-463/
package backtracking;

import java.util.*;

public class LeetCode463_Backtracking463 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode463_Backtracking463 solver = new LeetCode463_Backtracking463();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode463_Backtracking463 Passed!");
    }
}
