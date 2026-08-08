// https://leetcode.com/problems/freedom-trail/
package backtracking;

import java.util.*;

public class FreedomTrail {
    // LeetCode Problem 514: Freedom Trail
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
        FreedomTrail solver = new FreedomTrail();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ FreedomTrail Passed!");
    }
}
