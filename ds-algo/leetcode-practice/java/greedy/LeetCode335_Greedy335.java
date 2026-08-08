// https://leetcode.com/problems/greedy-choice-335/
package greedy;

import java.util.*;

public class LeetCode335_Greedy335 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode335_Greedy335 solver = new LeetCode335_Greedy335();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode335_Greedy335 Passed!");
    }
}
