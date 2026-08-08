// https://leetcode.com/problems/backtracking-subset-372/
package backtracking;

import java.util.*;

public class LeetCode372_Backtracking372 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode372_Backtracking372 solver = new LeetCode372_Backtracking372();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode372_Backtracking372 Passed!");
    }
}
