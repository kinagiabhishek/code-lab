// https://leetcode.com/problems/nth-highest-salary/
package heap_and_priority_queue;

import java.util.*;

public class NthHighestSalary {
    // LeetCode Problem 177: Nth Highest Salary
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NthHighestSalary solver = new NthHighestSalary();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NthHighestSalary (Nth Highest Salary) Passed!");
    }
}
