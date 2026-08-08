// https://leetcode.com/problems/greedy-choice-166/
package greedy;

import java.util.*;

public class LeetCode166_Greedy166 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode166_Greedy166 solver = new LeetCode166_Greedy166();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode166_Greedy166 Passed!");
    }
}
