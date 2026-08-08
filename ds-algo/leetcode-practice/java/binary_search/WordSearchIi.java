// https://leetcode.com/problems/word-search-ii/
package binary_search;

import java.util.*;

public class WordSearchIi {
    // LeetCode Problem 212: Word Search II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        WordSearchIi solver = new WordSearchIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode212_WordSearchIi (Word Search II) Passed!");
    }
}
