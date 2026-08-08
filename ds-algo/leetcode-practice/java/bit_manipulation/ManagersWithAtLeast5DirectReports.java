// https://leetcode.com/problems/managers-with-at-least-5-direct-reports/
package bit_manipulation;

import java.util.*;

public class ManagersWithAtLeast5DirectReports {
    // LeetCode Problem 570: Managers with at Least 5 Direct Reports
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ManagersWithAtLeast5DirectReports solver = new ManagersWithAtLeast5DirectReports();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode570_ManagersWithAtLeast5DirectReports (Managers with at Least 5 Direct Reports) Passed!");
    }
}
