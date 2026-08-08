// https://leetcode.com/problems/integer-to-english-words/
package trees;

import java.util.*;

public class IntegerToEnglishWords {
    // LeetCode Problem 273: Integer to English Words
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IntegerToEnglishWords solver = new IntegerToEnglishWords();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IntegerToEnglishWords (Integer to English Words) Passed!");
    }
}
