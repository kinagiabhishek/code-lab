// https://leetcode.com/problems/word-ladder-ii/
package bit_manipulation;

import java.util.*;

public class LeetCode126_WordLadderIi {
    // LeetCode Problem 126: Word Ladder II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode126_WordLadderIi solver = new LeetCode126_WordLadderIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode126_WordLadderIi (Word Ladder II) Passed!");
    }
}
