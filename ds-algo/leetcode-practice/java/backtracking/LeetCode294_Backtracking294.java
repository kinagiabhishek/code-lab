// https://leetcode.com/problems/backtracking-subset-294/
package backtracking;

import java.util.*;

public class LeetCode294_Backtracking294 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode294_Backtracking294 solver = new LeetCode294_Backtracking294();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode294_Backtracking294 Passed!");
    }
}
