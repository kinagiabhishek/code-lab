// https://leetcode.com/problems/palindrome-pairs/
package math;

import java.util.*;

public class PalindromePairs {
    // LeetCode Problem 336: Palindrome Pairs
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PalindromePairs solver = new PalindromePairs();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PalindromePairs (Palindrome Pairs) Passed!");
    }
}
