// https://leetcode.com/problems/length-of-last-word/
package bit_manipulation;

import java.util.*;

public class LengthOfLastWord {
    // LeetCode Problem 58: Length of Last Word
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LengthOfLastWord solver = new LengthOfLastWord();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode58_LengthOfLastWord (Length of Last Word) Passed!");
    }
}
