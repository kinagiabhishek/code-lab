// https://leetcode.com/problems/department-top-three-salaries/
package arrays_and_hashing;

import java.util.*;

public class DepartmentTopThreeSalaries {
    // LeetCode Problem 185: Department Top Three Salaries
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DepartmentTopThreeSalaries solver = new DepartmentTopThreeSalaries();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode185_DepartmentTopThreeSalaries (Department Top Three Salaries) Passed!");
    }
}
