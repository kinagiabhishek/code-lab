// https://leetcode.com/problems/backtracking-subset-424/
package backtracking;

import java.util.*;

public class LeetCode424_Backtracking424 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode424_Backtracking424 solver = new LeetCode424_Backtracking424();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode424_Backtracking424 Passed!");
    }
}
