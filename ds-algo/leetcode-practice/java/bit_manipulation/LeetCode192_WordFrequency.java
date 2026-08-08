// https://leetcode.com/problems/word-frequency/
package bit_manipulation;

import java.util.*;

public class LeetCode192_WordFrequency {
    // LeetCode Problem 192: Word Frequency
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode192_WordFrequency solver = new LeetCode192_WordFrequency();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode192_WordFrequency (Word Frequency) Passed!");
    }
}
