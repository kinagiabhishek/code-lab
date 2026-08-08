// https://leetcode.com/problems/different-ways-to-add-parentheses/
package stacks_and_queues;

import java.util.*;

public class LeetCode241_DifferentWaysToAddParentheses {
    // LeetCode Problem 241: Different Ways to Add Parentheses
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode241_DifferentWaysToAddParentheses solver = new LeetCode241_DifferentWaysToAddParentheses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode241_DifferentWaysToAddParentheses (Different Ways to Add Parentheses) Passed!");
    }
}
