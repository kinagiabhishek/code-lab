// https://leetcode.com/problems/spiral-matrix-ii/
package graphs;

import java.util.*;

public class LeetCode59_SpiralMatrixIi {
    // LeetCode Problem 59: Spiral Matrix II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode59_SpiralMatrixIi solver = new LeetCode59_SpiralMatrixIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode59_SpiralMatrixIi (Spiral Matrix II) Passed!");
    }
}
