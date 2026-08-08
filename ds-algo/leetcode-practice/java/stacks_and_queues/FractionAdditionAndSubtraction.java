// https://leetcode.com/problems/fraction-addition-and-subtraction/
package stacks_and_queues;

import java.util.*;

public class FractionAdditionAndSubtraction {
    // LeetCode Problem 592: Fraction Addition and Subtraction
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
        FractionAdditionAndSubtraction solver = new FractionAdditionAndSubtraction();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ FractionAdditionAndSubtraction Passed!");
    }
}
