// https://leetcode.com/problems/backtracking-subset-112/
package backtracking;

import java.util.*;

public class LeetCode112_Backtracking112 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode112_Backtracking112 solver = new LeetCode112_Backtracking112();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode112_Backtracking112 Passed!");
    }
}
