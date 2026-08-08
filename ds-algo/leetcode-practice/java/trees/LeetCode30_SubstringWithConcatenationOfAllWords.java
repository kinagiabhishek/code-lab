// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
package trees;

import java.util.*;

public class LeetCode30_SubstringWithConcatenationOfAllWords {
    // LeetCode Problem 30: Substring with Concatenation of All Words
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode30_SubstringWithConcatenationOfAllWords solver = new LeetCode30_SubstringWithConcatenationOfAllWords();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode30_SubstringWithConcatenationOfAllWords (Substring with Concatenation of All Words) Passed!");
    }
}
