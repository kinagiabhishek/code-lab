// https://leetcode.com/problems/investments-in-2016/
package dynamic_programming;

import java.util.*;

public class InvestmentsIn2016 {
    // LeetCode Problem 585: Investments in 2016
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
        InvestmentsIn2016 solver = new InvestmentsIn2016();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ InvestmentsIn2016 Passed!");
    }
}
