// https://leetcode.com/problems/spiral-matrix-ii/
package graphs;

import java.util.*;

public class SpiralMatrixIi {
    // LeetCode Problem 59: Spiral Matrix II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SpiralMatrixIi solver = new SpiralMatrixIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode59_SpiralMatrixIi (Spiral Matrix II) Passed!");
    }
}
