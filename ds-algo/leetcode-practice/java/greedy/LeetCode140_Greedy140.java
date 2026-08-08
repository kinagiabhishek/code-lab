// https://leetcode.com/problems/greedy-choice-140/
package greedy;

import java.util.*;

public class LeetCode140_Greedy140 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode140_Greedy140 solver = new LeetCode140_Greedy140();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode140_Greedy140 Passed!");
    }
}
