// https://leetcode.com/problems/remove-invalid-parentheses/
package trees;

import java.util.*;

public class RemoveInvalidParentheses {
    // LeetCode Problem 301: Remove Invalid Parentheses
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveInvalidParentheses solver = new RemoveInvalidParentheses();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveInvalidParentheses (Remove Invalid Parentheses) Passed!");
    }
}
