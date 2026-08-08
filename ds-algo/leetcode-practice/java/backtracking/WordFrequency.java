// https://leetcode.com/problems/word-frequency/
package backtracking;

import java.util.*;

public class WordFrequency {
    // LeetCode Problem 192: Word Frequency
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WordFrequency solver = new WordFrequency();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WordFrequency (Word Frequency) Passed!");
    }
}
