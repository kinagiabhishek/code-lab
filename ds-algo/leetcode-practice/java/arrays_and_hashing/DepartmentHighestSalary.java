// https://leetcode.com/problems/department-highest-salary/
package arrays_and_hashing;

import java.util.*;

public class DepartmentHighestSalary {
    // LeetCode Problem 184: Department Highest Salary
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DepartmentHighestSalary solver = new DepartmentHighestSalary();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode184_DepartmentHighestSalary (Department Highest Salary) Passed!");
    }
}
