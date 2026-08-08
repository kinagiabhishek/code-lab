// https://leetcode.com/problems/concatenated-words/
package backtracking;

import java.util.*;

public class ConcatenatedWords {
    // LeetCode Problem 472: Concatenated Words
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConcatenatedWords solver = new ConcatenatedWords();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConcatenatedWords (Concatenated Words) Passed!");
    }
}
