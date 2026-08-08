// https://leetcode.com/problems/greedy-choice-322/
package greedy;

import java.util.*;

public class LeetCode322_Greedy322 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode322_Greedy322 solver = new LeetCode322_Greedy322();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode322_Greedy322 Passed!");
    }
}
