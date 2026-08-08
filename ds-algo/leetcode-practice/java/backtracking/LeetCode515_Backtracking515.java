// https://leetcode.com/problems/backtracking-subset-515/
package backtracking;

import java.util.*;

public class LeetCode515_Backtracking515 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode515_Backtracking515 solver = new LeetCode515_Backtracking515();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode515_Backtracking515 Passed!");
    }
}
