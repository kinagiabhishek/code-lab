// https://leetcode.com/problems/backtracking-subset-333/
package backtracking;

import java.util.*;

public class LeetCode333_Backtracking333 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode333_Backtracking333 solver = new LeetCode333_Backtracking333();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode333_Backtracking333 Passed!");
    }
}
