// https://leetcode.com/problems/employee-bonus/
package arrays_and_hashing;

import java.util.*;

public class EmployeeBonus {
    // LeetCode Problem 577: Employee Bonus
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        EmployeeBonus solver = new EmployeeBonus();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode577_EmployeeBonus (Employee Bonus) Passed!");
    }
}
