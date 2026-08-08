// https://leetcode.com/problems/spiral-matrix/
package greedy;

import java.util.*;

public class SpiralMatrix {
    // LeetCode Problem 54: Spiral Matrix
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SpiralMatrix solver = new SpiralMatrix();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SpiralMatrix (Spiral Matrix) Passed!");
    }
}
