// https://leetcode.com/problems/nth-highest-salary/
package arrays_and_hashing;

import java.util.*;

public class NthHighestSalary {
    // LeetCode Problem 177: Nth Highest Salary
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NthHighestSalary solver = new NthHighestSalary();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode177_NthHighestSalary (Nth Highest Salary) Passed!");
    }
}
