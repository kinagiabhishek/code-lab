// https://leetcode.com/problems/greedy-choice-348/
package greedy;

import java.util.*;

public class LeetCode348_Greedy348 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode348_Greedy348 solver = new LeetCode348_Greedy348();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode348_Greedy348 Passed!");
    }
}
