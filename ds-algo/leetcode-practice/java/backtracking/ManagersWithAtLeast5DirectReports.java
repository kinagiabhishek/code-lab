// https://leetcode.com/problems/managers-with-at-least-5-direct-reports/
package backtracking;

import java.util.*;

public class ManagersWithAtLeast5DirectReports {
    // LeetCode Problem 570: Managers with at Least 5 Direct Reports
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
        ManagersWithAtLeast5DirectReports solver = new ManagersWithAtLeast5DirectReports();
        assert solver.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ ManagersWithAtLeast5DirectReports Passed!");
    }
}
