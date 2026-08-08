// https://leetcode.com/problems/greedy-choice-439/
package greedy;

import java.util.*;

public class LeetCode439_Greedy439 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode439_Greedy439 solver = new LeetCode439_Greedy439();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode439_Greedy439 Passed!");
    }
}
