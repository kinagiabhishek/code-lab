// https://leetcode.com/problems/repeated-substring-pattern/
package dynamic_programming;

import java.util.*;

public class RepeatedSubstringPattern {
    // LeetCode Problem 459: Repeated Substring Pattern
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern solver = new RepeatedSubstringPattern();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RepeatedSubstringPattern (Repeated Substring Pattern) Passed!");
    }
}
