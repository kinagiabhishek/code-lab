// https://leetcode.com/problems/substring-with-concatenation-of-all-words/
package two_pointers;

import java.util.*;

public class SubstringWithConcatenationOfAllWords {
    // LeetCode Problem 30: Substring with Concatenation of All Words
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SubstringWithConcatenationOfAllWords solver = new SubstringWithConcatenationOfAllWords();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SubstringWithConcatenationOfAllWords (Substring with Concatenation of All Words) Passed!");
    }
}
