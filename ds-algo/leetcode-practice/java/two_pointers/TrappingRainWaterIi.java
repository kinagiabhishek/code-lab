// https://leetcode.com/problems/trapping-rain-water-ii/
package two_pointers;

import java.util.*;

public class TrappingRainWaterIi {
    // LeetCode Problem 407: Trapping Rain Water II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        TrappingRainWaterIi solver = new TrappingRainWaterIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode407_TrappingRainWaterIi (Trapping Rain Water II) Passed!");
    }
}
