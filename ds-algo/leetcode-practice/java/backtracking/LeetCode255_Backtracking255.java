// https://leetcode.com/problems/backtracking-subset-255/
package backtracking;

import java.util.*;

public class LeetCode255_Backtracking255 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode255_Backtracking255 solver = new LeetCode255_Backtracking255();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode255_Backtracking255 Passed!");
    }
}
