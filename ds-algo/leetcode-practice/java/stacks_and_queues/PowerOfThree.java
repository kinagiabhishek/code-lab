// https://leetcode.com/problems/power-of-three/
package stacks_and_queues;

import java.util.*;

public class PowerOfThree {
    // LeetCode Problem 326: Power of Three
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
        PowerOfThree solver = new PowerOfThree();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ PowerOfThree Passed!");
    }
}
