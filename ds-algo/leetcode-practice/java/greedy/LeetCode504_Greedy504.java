// https://leetcode.com/problems/greedy-choice-504/
package greedy;

import java.util.*;

public class LeetCode504_Greedy504 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode504_Greedy504 solver = new LeetCode504_Greedy504();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode504_Greedy504 Passed!");
    }
}
