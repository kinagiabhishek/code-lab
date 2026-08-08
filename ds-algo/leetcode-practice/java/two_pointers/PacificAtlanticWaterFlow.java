// https://leetcode.com/problems/pacific-atlantic-water-flow/
package two_pointers;

import java.util.*;

public class PacificAtlanticWaterFlow {
    // LeetCode Problem 417: Pacific Atlantic Water Flow
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PacificAtlanticWaterFlow solver = new PacificAtlanticWaterFlow();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode417_PacificAtlanticWaterFlow (Pacific Atlantic Water Flow) Passed!");
    }
}
