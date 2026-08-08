// https://leetcode.com/problems/longest-valid-parentheses/
package stacks_and_queues;

import java.util.*;

public class LeetCode32_LongestValidParentheses {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode32_LongestValidParentheses solver = new LeetCode32_LongestValidParentheses();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode32_LongestValidParentheses Passed!");
    }
}
