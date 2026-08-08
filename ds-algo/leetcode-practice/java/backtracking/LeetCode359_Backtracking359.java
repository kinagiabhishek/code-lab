// https://leetcode.com/problems/backtracking-subset-359/
package backtracking;

import java.util.*;

public class LeetCode359_Backtracking359 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode359_Backtracking359 solver = new LeetCode359_Backtracking359();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode359_Backtracking359 Passed!");
    }
}
