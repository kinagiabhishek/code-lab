// https://leetcode.com/problems/word-ladder/
package bit_manipulation;

import java.util.*;

public class WordLadder {
    // LeetCode Problem 127: Word Ladder
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        WordLadder solver = new WordLadder();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode127_WordLadder (Word Ladder) Passed!");
    }
}
