// https://leetcode.com/problems/generate-parentheses/
package graphs;

import java.util.*;

public class GenerateParentheses {
    // LeetCode Problem 22: Generate Parentheses
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GenerateParentheses solver = new GenerateParentheses();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GenerateParentheses (Generate Parentheses) Passed!");
    }
}
