// https://leetcode.com/problems/backtracking-subset-125/
package backtracking;

import java.util.*;

public class LeetCode125_Backtracking125 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode125_Backtracking125 solver = new LeetCode125_Backtracking125();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode125_Backtracking125 Passed!");
    }
}
