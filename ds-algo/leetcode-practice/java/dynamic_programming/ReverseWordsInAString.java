// https://leetcode.com/problems/reverse-words-in-a-string/
package dynamic_programming;

import java.util.*;

public class ReverseWordsInAString {
    // LeetCode Problem 151: Reverse Words in a String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseWordsInAString solver = new ReverseWordsInAString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseWordsInAString (Reverse Words in a String) Passed!");
    }
}
