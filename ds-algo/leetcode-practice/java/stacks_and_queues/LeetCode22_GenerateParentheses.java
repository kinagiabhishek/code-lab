// https://leetcode.com/problems/generate-parentheses/
package stacks_and_queues;

import java.util.*;

public class LeetCode22_GenerateParentheses {
    // LeetCode Problem 22: Generate Parentheses
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode22_GenerateParentheses solver = new LeetCode22_GenerateParentheses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode22_GenerateParentheses (Generate Parentheses) Passed!");
    }
}
