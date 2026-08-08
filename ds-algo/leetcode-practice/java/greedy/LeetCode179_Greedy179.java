// https://leetcode.com/problems/greedy-choice-179/
package greedy;

import java.util.*;

public class LeetCode179_Greedy179 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode179_Greedy179 solver = new LeetCode179_Greedy179();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode179_Greedy179 Passed!");
    }
}
