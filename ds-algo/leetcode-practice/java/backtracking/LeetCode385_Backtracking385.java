// https://leetcode.com/problems/backtracking-subset-385/
package backtracking;

import java.util.*;

public class LeetCode385_Backtracking385 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode385_Backtracking385 solver = new LeetCode385_Backtracking385();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode385_Backtracking385 Passed!");
    }
}
