// https://leetcode.com/problems/greedy-choice-387/
package greedy;

import java.util.*;

public class LeetCode387_Greedy387 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode387_Greedy387 solver = new LeetCode387_Greedy387();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode387_Greedy387 Passed!");
    }
}
