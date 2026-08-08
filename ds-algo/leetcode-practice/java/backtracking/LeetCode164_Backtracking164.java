// https://leetcode.com/problems/backtracking-subset-164/
package backtracking;

import java.util.*;

public class LeetCode164_Backtracking164 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode164_Backtracking164 solver = new LeetCode164_Backtracking164();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode164_Backtracking164 Passed!");
    }
}
