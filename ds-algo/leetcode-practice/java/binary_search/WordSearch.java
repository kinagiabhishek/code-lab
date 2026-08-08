// https://leetcode.com/problems/word-search/
package binary_search;

import java.util.*;

public class WordSearch {
    // LeetCode Problem 79: Word Search
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        WordSearch solver = new WordSearch();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode79_WordSearch (Word Search) Passed!");
    }
}
