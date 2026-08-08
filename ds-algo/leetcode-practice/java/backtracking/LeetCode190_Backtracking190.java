// https://leetcode.com/problems/backtracking-subset-190/
package backtracking;

import java.util.*;

public class LeetCode190_Backtracking190 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode190_Backtracking190 solver = new LeetCode190_Backtracking190();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode190_Backtracking190 Passed!");
    }
}
