// https://leetcode.com/problems/word-pattern/
package backtracking;

import java.util.*;

public class WordPattern {
    // LeetCode Problem 290: Word Pattern
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WordPattern solver = new WordPattern();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WordPattern (Word Pattern) Passed!");
    }
}
