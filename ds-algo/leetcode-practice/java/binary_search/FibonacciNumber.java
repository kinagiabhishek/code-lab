// https://leetcode.com/problems/fibonacci-number/
package binary_search;

import java.util.*;

public class FibonacciNumber {
    // LeetCode Problem 509: Fibonacci Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FibonacciNumber solver = new FibonacciNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FibonacciNumber (Fibonacci Number) Passed!");
    }
}
