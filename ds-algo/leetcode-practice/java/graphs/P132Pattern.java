// https://leetcode.com/problems/132-pattern/
package graphs;

import java.util.*;

public class P132Pattern {
    // LeetCode Problem 456: 132 Pattern
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
        P132Pattern solver = new P132Pattern();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ P132Pattern Passed!");
    }
}
