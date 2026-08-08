// https://leetcode.com/problems/greedy-choice-309/
package greedy;

import java.util.*;

public class LeetCode309_Greedy309 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode309_Greedy309 solver = new LeetCode309_Greedy309();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode309_Greedy309 Passed!");
    }
}
