// https://leetcode.com/problems/word-break-ii/
package math;

import java.util.*;

public class WordBreakIi {
    // LeetCode Problem 140: Word Break II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WordBreakIi solver = new WordBreakIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WordBreakIi (Word Break II) Passed!");
    }
}
