// https://leetcode.com/problems/backtracking-subset-86/
package backtracking;

import java.util.*;

public class LeetCode86_Backtracking86 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode86_Backtracking86 solver = new LeetCode86_Backtracking86();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode86_Backtracking86 Passed!");
    }
}
