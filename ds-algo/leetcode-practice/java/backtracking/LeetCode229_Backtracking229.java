// https://leetcode.com/problems/backtracking-subset-229/
package backtracking;

import java.util.*;

public class LeetCode229_Backtracking229 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode229_Backtracking229 solver = new LeetCode229_Backtracking229();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode229_Backtracking229 Passed!");
    }
}
