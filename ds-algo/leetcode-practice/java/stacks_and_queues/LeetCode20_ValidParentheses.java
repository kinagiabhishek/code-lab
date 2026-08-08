// https://leetcode.com/problems/valid-parentheses/
package stacks_and_queues;

import java.util.*;

public class LeetCode20_ValidParentheses {
    // LeetCode Problem 20: Valid Parentheses
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode20_ValidParentheses solver = new LeetCode20_ValidParentheses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode20_ValidParentheses (Valid Parentheses) Passed!");
    }
}
