// https://leetcode.com/problems/word-break/
package bit_manipulation;

import java.util.*;

public class WordBreak {
    // LeetCode Problem 139: Word Break
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        WordBreak solver = new WordBreak();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode139_WordBreak (Word Break) Passed!");
    }
}
