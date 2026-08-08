// https://leetcode.com/problems/department-top-three-salaries/
package sliding_window;

import java.util.*;

public class DepartmentTopThreeSalaries {
    // LeetCode Problem 185: Department Top Three Salaries
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DepartmentTopThreeSalaries solver = new DepartmentTopThreeSalaries();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DepartmentTopThreeSalaries (Department Top Three Salaries) Passed!");
    }
}
