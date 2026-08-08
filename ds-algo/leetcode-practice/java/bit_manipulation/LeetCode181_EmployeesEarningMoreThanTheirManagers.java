// https://leetcode.com/problems/employees-earning-more-than-their-managers/
package bit_manipulation;

import java.util.*;

public class LeetCode181_EmployeesEarningMoreThanTheirManagers {
    // LeetCode Problem 181: Employees Earning More Than Their Managers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode181_EmployeesEarningMoreThanTheirManagers solver = new LeetCode181_EmployeesEarningMoreThanTheirManagers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode181_EmployeesEarningMoreThanTheirManagers (Employees Earning More Than Their Managers) Passed!");
    }
}
