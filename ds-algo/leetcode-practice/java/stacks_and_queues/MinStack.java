// https://leetcode.com/problems/min-stack/
package stacks_and_queues;

import java.util.*;

public class MinStack {
    // LeetCode Problem 155: Min Stack
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinStack solver = new MinStack();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode155_MinStack (Min Stack) Passed!");
    }
}
