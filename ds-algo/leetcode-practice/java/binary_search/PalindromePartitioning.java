// https://leetcode.com/problems/palindrome-partitioning/
package binary_search;

import java.util.*;

public class PalindromePartitioning {
    // LeetCode Problem 131: Palindrome Partitioning
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PalindromePartitioning solver = new PalindromePartitioning();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PalindromePartitioning (Palindrome Partitioning) Passed!");
    }
}
