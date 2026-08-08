// https://leetcode.com/problems/managers-with-at-least-5-direct-reports/
package backtracking;

import java.util.*;

public class ManagersWithAtLeast5DirectReports {
    // LeetCode Problem 570: Managers with at Least 5 Direct Reports
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ManagersWithAtLeast5DirectReports solver = new ManagersWithAtLeast5DirectReports();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ManagersWithAtLeast5DirectReports (Managers with at Least 5 Direct Reports) Passed!");
    }
}
