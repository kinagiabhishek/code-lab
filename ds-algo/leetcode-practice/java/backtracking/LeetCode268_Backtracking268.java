// https://leetcode.com/problems/backtracking-subset-268/
package backtracking;

import java.util.*;

public class LeetCode268_Backtracking268 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode268_Backtracking268 solver = new LeetCode268_Backtracking268();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode268_Backtracking268 Passed!");
    }
}
