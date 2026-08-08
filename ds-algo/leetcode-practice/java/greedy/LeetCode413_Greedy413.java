// https://leetcode.com/problems/greedy-choice-413/
package greedy;

import java.util.*;

public class LeetCode413_Greedy413 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode413_Greedy413 solver = new LeetCode413_Greedy413();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode413_Greedy413 Passed!");
    }
}
