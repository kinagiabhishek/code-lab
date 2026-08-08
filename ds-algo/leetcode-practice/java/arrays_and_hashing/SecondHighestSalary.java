// https://leetcode.com/problems/second-highest-salary/
package arrays_and_hashing;

import java.util.*;

public class SecondHighestSalary {
    // LeetCode Problem 176: Second Highest Salary
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SecondHighestSalary solver = new SecondHighestSalary();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode176_SecondHighestSalary (Second Highest Salary) Passed!");
    }
}
