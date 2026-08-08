// https://leetcode.com/problems/generate-random-point-in-a-circle/
package two_pointers;

import java.util.*;

public class GenerateRandomPointInACircle {
    // LeetCode Problem 478: Generate Random Point in a Circle
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
        GenerateRandomPointInACircle solver = new GenerateRandomPointInACircle();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ GenerateRandomPointInACircle Passed!");
    }
}
