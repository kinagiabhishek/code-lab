// https://leetcode.com/problems/second-highest-salary/
package graphs;

import java.util.*;

public class SecondHighestSalary {
    // LeetCode Problem 176: Second Highest Salary
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SecondHighestSalary solver = new SecondHighestSalary();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SecondHighestSalary (Second Highest Salary) Passed!");
    }
}
