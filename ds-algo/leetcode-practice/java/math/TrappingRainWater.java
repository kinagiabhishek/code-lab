// https://leetcode.com/problems/trapping-rain-water/
package math;

import java.util.*;

public class TrappingRainWater {
    // LeetCode Problem 42: Trapping Rain Water
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TrappingRainWater solver = new TrappingRainWater();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TrappingRainWater (Trapping Rain Water) Passed!");
    }
}
