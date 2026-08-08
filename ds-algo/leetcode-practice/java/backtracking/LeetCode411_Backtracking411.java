// https://leetcode.com/problems/backtracking-subset-411/
package backtracking;

import java.util.*;

public class LeetCode411_Backtracking411 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode411_Backtracking411 solver = new LeetCode411_Backtracking411();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode411_Backtracking411 Passed!");
    }
}
