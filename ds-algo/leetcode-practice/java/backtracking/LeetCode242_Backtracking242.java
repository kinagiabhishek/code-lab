// https://leetcode.com/problems/backtracking-subset-242/
package backtracking;

import java.util.*;

public class LeetCode242_Backtracking242 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode242_Backtracking242 solver = new LeetCode242_Backtracking242();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode242_Backtracking242 Passed!");
    }
}
