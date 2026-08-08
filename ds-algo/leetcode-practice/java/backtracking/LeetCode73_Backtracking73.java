// https://leetcode.com/problems/backtracking-subset-73/
package backtracking;

import java.util.*;

public class LeetCode73_Backtracking73 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode73_Backtracking73 solver = new LeetCode73_Backtracking73();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode73_Backtracking73 Passed!");
    }
}
