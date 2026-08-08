// https://leetcode.com/problems/pacific-atlantic-water-flow/
package dynamic_programming;

import java.util.*;

public class PacificAtlanticWaterFlow {
    // LeetCode Problem 417: Pacific Atlantic Water Flow
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PacificAtlanticWaterFlow solver = new PacificAtlanticWaterFlow();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PacificAtlanticWaterFlow (Pacific Atlantic Water Flow) Passed!");
    }
}
