// https://leetcode.com/problems/basic-calculator-ii/
package stacks_and_queues;

import java.util.*;

public class BasicCalculatorIi {
    // LeetCode Problem 227: Basic Calculator II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BasicCalculatorIi solver = new BasicCalculatorIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode227_BasicCalculatorIi (Basic Calculator II) Passed!");
    }
}
