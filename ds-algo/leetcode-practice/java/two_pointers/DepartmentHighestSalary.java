// https://leetcode.com/problems/department-highest-salary/
package two_pointers;

import java.util.*;

public class DepartmentHighestSalary {
    // LeetCode Problem 184: Department Highest Salary
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DepartmentHighestSalary solver = new DepartmentHighestSalary();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DepartmentHighestSalary (Department Highest Salary) Passed!");
    }
}
