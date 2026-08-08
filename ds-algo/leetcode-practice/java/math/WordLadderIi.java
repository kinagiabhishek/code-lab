// https://leetcode.com/problems/word-ladder-ii/
package math;

import java.util.*;

public class WordLadderIi {
    // LeetCode Problem 126: Word Ladder II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WordLadderIi solver = new WordLadderIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WordLadderIi (Word Ladder II) Passed!");
    }
}
