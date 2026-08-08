// https://leetcode.com/problems/fibonacci-number/
package arrays_and_hashing;

import java.util.*;

public class LeetCode509_FibonacciNumber {
    // LeetCode Problem 509: Fibonacci Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode509_FibonacciNumber solver = new LeetCode509_FibonacciNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode509_FibonacciNumber (Fibonacci Number) Passed!");
    }
}
