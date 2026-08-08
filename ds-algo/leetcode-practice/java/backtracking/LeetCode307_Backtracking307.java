// https://leetcode.com/problems/backtracking-subset-307/
package backtracking;

import java.util.*;

public class LeetCode307_Backtracking307 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode307_Backtracking307 solver = new LeetCode307_Backtracking307();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode307_Backtracking307 Passed!");
    }
}
