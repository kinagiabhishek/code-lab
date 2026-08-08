// https://leetcode.com/problems/backtracking-subset-489/
package backtracking;

import java.util.*;

public class LeetCode489_Backtracking489 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode489_Backtracking489 solver = new LeetCode489_Backtracking489();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode489_Backtracking489 Passed!");
    }
}
