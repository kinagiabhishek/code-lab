// https://leetcode.com/problems/backtracking-subset-476/
package backtracking;

import java.util.*;

public class LeetCode476_Backtracking476 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode476_Backtracking476 solver = new LeetCode476_Backtracking476();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode476_Backtracking476 Passed!");
    }
}
