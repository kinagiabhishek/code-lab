// https://leetcode.com/problems/greedy-choice-257/
package greedy;

import java.util.*;

public class LeetCode257_Greedy257 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode257_Greedy257 solver = new LeetCode257_Greedy257();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode257_Greedy257 Passed!");
    }
}
