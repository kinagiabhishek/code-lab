// https://leetcode.com/problems/backtracking-subset-203/
package backtracking;

import java.util.*;

public class LeetCode203_Backtracking203 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode203_Backtracking203 solver = new LeetCode203_Backtracking203();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode203_Backtracking203 Passed!");
    }
}
