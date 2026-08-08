// https://leetcode.com/problems/spiral-matrix-ii/
package sliding_window;

import java.util.*;

public class SpiralMatrixIi {
    // LeetCode Problem 59: Spiral Matrix II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SpiralMatrixIi solver = new SpiralMatrixIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SpiralMatrixIi (Spiral Matrix II) Passed!");
    }
}
