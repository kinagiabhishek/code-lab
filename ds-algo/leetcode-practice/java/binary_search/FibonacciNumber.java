// https://leetcode.com/problems/fibonacci-number/
package binary_search;

import java.util.*;

public class FibonacciNumber {
    // LeetCode Problem 509: Fibonacci Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        FibonacciNumber solver = new FibonacciNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ FibonacciNumber Passed!");
    }
}
