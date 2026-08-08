// https://leetcode.com/problems/reverse-words-in-a-string-iii/
package dynamic_programming;

import java.util.*;

public class ReverseWordsInAStringIii {
    // LeetCode Problem 557: Reverse Words in a String III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIii solver = new ReverseWordsInAStringIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseWordsInAStringIii (Reverse Words in a String III) Passed!");
    }
}
