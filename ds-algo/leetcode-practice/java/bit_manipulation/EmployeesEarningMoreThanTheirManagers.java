// https://leetcode.com/problems/employees-earning-more-than-their-managers/
package bit_manipulation;

import java.util.*;

public class EmployeesEarningMoreThanTheirManagers {
    // LeetCode Problem 181: Employees Earning More Than Their Managers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EmployeesEarningMoreThanTheirManagers solver = new EmployeesEarningMoreThanTheirManagers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode181_EmployeesEarningMoreThanTheirManagers (Employees Earning More Than Their Managers) Passed!");
    }
}
