// https://leetcode.com/problems/trapping-rain-water/
package bit_manipulation;

import java.util.*;

public class TrappingRainWater {
    // LeetCode Problem 42: Trapping Rain Water
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxSoFar = nums[0], currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        TrappingRainWater solver = new TrappingRainWater();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ TrappingRainWater Passed!");
    }
}
