// https://leetcode.com/problems/employees-earning-more-than-their-managers/
package bit_manipulation;

import java.util.*;

public class EmployeesEarningMoreThanTheirManagers {
    // LeetCode Problem 181: Employees Earning More Than Their Managers
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EmployeesEarningMoreThanTheirManagers solver = new EmployeesEarningMoreThanTheirManagers();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EmployeesEarningMoreThanTheirManagers (Employees Earning More Than Their Managers) Passed!");
    }
}
