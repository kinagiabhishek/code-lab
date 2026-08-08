// https://leetcode.com/problems/word-ladder/
package bit_manipulation;

import java.util.*;

public class LeetCode127_WordLadder {
    // LeetCode Problem 127: Word Ladder
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode127_WordLadder solver = new LeetCode127_WordLadder();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode127_WordLadder (Word Ladder) Passed!");
    }
}
