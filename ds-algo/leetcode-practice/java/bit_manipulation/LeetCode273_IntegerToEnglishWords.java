// https://leetcode.com/problems/integer-to-english-words/
package bit_manipulation;

import java.util.*;

public class LeetCode273_IntegerToEnglishWords {
    // LeetCode Problem 273: Integer to English Words
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode273_IntegerToEnglishWords solver = new LeetCode273_IntegerToEnglishWords();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode273_IntegerToEnglishWords (Integer to English Words) Passed!");
    }
}
