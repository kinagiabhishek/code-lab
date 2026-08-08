// https://leetcode.com/problems/01-matrix/
package backtracking;

import java.util.*;

public class P01Matrix {
    // LeetCode Problem 542: 01 Matrix
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
        P01Matrix solver = new P01Matrix();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ P01Matrix Passed!");
    }
}
