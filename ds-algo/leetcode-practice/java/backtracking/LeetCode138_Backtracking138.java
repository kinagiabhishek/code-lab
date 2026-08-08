// https://leetcode.com/problems/backtracking-subset-138/
package backtracking;

import java.util.*;

public class LeetCode138_Backtracking138 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode138_Backtracking138 solver = new LeetCode138_Backtracking138();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode138_Backtracking138 Passed!");
    }
}
