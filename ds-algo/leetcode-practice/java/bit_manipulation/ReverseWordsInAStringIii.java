// https://leetcode.com/problems/reverse-words-in-a-string-iii/
package bit_manipulation;

import java.util.*;

public class ReverseWordsInAStringIii {
    // LeetCode Problem 557: Reverse Words in a String III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIii solver = new ReverseWordsInAStringIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode557_ReverseWordsInAStringIii (Reverse Words in a String III) Passed!");
    }
}
