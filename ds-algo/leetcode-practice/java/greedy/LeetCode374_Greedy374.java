// https://leetcode.com/problems/greedy-choice-374/
package greedy;

import java.util.*;

public class LeetCode374_Greedy374 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode374_Greedy374 solver = new LeetCode374_Greedy374();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode374_Greedy374 Passed!");
    }
}
