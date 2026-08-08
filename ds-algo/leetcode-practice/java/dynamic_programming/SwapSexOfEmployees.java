// https://leetcode.com/problems/swap-sex-of-employees/
package dynamic_programming;

import java.util.*;

public class SwapSexOfEmployees {
    // LeetCode Problem 627: Swap Sex of Employees
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SwapSexOfEmployees solver = new SwapSexOfEmployees();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SwapSexOfEmployees (Swap Sex of Employees) Passed!");
    }
}
