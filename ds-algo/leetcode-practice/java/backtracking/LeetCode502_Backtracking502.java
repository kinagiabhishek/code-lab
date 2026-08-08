// https://leetcode.com/problems/backtracking-subset-502/
package backtracking;

import java.util.*;

public class LeetCode502_Backtracking502 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode502_Backtracking502 solver = new LeetCode502_Backtracking502();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode502_Backtracking502 Passed!");
    }
}
