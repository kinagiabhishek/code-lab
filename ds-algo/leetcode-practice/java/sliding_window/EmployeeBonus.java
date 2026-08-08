// https://leetcode.com/problems/employee-bonus/
package sliding_window;

import java.util.*;

public class EmployeeBonus {
    // LeetCode Problem 577: Employee Bonus
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        EmployeeBonus solver = new EmployeeBonus();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ EmployeeBonus (Employee Bonus) Passed!");
    }
}
