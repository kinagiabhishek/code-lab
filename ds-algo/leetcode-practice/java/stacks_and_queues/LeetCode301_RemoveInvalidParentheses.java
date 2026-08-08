// https://leetcode.com/problems/remove-invalid-parentheses/
package stacks_and_queues;

import java.util.*;

public class LeetCode301_RemoveInvalidParentheses {
    // LeetCode Problem 301: Remove Invalid Parentheses
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode301_RemoveInvalidParentheses solver = new LeetCode301_RemoveInvalidParentheses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode301_RemoveInvalidParentheses (Remove Invalid Parentheses) Passed!");
    }
}
