// https://leetcode.com/problems/backtracking-subset-216/
package backtracking;

import java.util.*;

public class LeetCode216_Backtracking216 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode216_Backtracking216 solver = new LeetCode216_Backtracking216();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode216_Backtracking216 Passed!");
    }
}
