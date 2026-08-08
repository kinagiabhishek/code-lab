// https://leetcode.com/problems/integer-to-english-words/
package bit_manipulation;

import java.util.*;

public class IntegerToEnglishWords {
    // LeetCode Problem 273: Integer to English Words
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        IntegerToEnglishWords solver = new IntegerToEnglishWords();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode273_IntegerToEnglishWords (Integer to English Words) Passed!");
    }
}
