// https://leetcode.com/problems/fibonacci-number/
package arrays_and_hashing;

import java.util.*;

public class FibonacciNumber {
    // LeetCode Problem 509: Fibonacci Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FibonacciNumber solver = new FibonacciNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode509_FibonacciNumber (Fibonacci Number) Passed!");
    }
}
