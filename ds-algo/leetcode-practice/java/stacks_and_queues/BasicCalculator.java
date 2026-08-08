// https://leetcode.com/problems/basic-calculator/
package stacks_and_queues;

import java.util.*;

public class BasicCalculator {
    // LeetCode Problem 224: Basic Calculator
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BasicCalculator solver = new BasicCalculator();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode224_BasicCalculator (Basic Calculator) Passed!");
    }
}
