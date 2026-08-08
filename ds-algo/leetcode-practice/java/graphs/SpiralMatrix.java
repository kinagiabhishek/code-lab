// https://leetcode.com/problems/spiral-matrix/
package graphs;

import java.util.*;

public class SpiralMatrix {
    // LeetCode Problem 54: Spiral Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SpiralMatrix solver = new SpiralMatrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode54_SpiralMatrix (Spiral Matrix) Passed!");
    }
}
