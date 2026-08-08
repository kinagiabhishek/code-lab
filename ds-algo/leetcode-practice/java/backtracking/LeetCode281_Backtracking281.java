// https://leetcode.com/problems/backtracking-subset-281/
package backtracking;

import java.util.*;

public class LeetCode281_Backtracking281 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode281_Backtracking281 solver = new LeetCode281_Backtracking281();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode281_Backtracking281 Passed!");
    }
}
