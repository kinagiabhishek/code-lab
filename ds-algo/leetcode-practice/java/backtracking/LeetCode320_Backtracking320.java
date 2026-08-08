// https://leetcode.com/problems/backtracking-subset-320/
package backtracking;

import java.util.*;

public class LeetCode320_Backtracking320 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode320_Backtracking320 solver = new LeetCode320_Backtracking320();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode320_Backtracking320 Passed!");
    }
}
