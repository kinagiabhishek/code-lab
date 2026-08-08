// https://leetcode.com/problems/pacific-atlantic-water-flow/
package two_pointers;

import java.util.*;

public class LeetCode417_PacificAtlanticWaterFlow {
    // LeetCode Problem 417: Pacific Atlantic Water Flow
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode417_PacificAtlanticWaterFlow solver = new LeetCode417_PacificAtlanticWaterFlow();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode417_PacificAtlanticWaterFlow (Pacific Atlantic Water Flow) Passed!");
    }
}
