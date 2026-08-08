// https://leetcode.com/problems/range-sum-query-2d-immutable/
package backtracking;

import java.util.*;

public class RangeSumQuery2dImmutable {
    // LeetCode Problem 304: Range Sum Query 2D - Immutable
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
        RangeSumQuery2dImmutable solver = new RangeSumQuery2dImmutable();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ RangeSumQuery2dImmutable Passed!");
    }
}
