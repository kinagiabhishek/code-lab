// https://leetcode.com/problems/different-ways-to-add-parentheses/
package sliding_window;

import java.util.*;

public class DifferentWaysToAddParentheses {
    // LeetCode Problem 241: Different Ways to Add Parentheses
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DifferentWaysToAddParentheses solver = new DifferentWaysToAddParentheses();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DifferentWaysToAddParentheses (Different Ways to Add Parentheses) Passed!");
    }
}
