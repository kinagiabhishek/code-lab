// https://leetcode.com/problems/backtracking-subset-99/
package backtracking;

import java.util.*;

public class LeetCode99_Backtracking99 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode99_Backtracking99 solver = new LeetCode99_Backtracking99();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode99_Backtracking99 Passed!");
    }
}
