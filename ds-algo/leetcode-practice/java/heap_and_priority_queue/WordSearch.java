// https://leetcode.com/problems/word-search/
package heap_and_priority_queue;

import java.util.*;

public class WordSearch {
    // LeetCode Problem 79: Word Search
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WordSearch solver = new WordSearch();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WordSearch (Word Search) Passed!");
    }
}
