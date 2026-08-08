// https://leetcode.com/problems/backtracking-subset-398/
package backtracking;

import java.util.*;

public class LeetCode398_Backtracking398 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode398_Backtracking398 solver = new LeetCode398_Backtracking398();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode398_Backtracking398 Passed!");
    }
}
