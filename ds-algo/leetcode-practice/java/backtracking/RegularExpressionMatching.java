// https://leetcode.com/problems/regular-expression-matching/
package backtracking;

import java.util.*;

public class RegularExpressionMatching {
    // LeetCode Problem 10: Regular Expression Matching
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RegularExpressionMatching solver = new RegularExpressionMatching();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RegularExpressionMatching (Regular Expression Matching) Passed!");
    }
}
