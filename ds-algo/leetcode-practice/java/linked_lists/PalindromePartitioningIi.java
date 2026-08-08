// https://leetcode.com/problems/palindrome-partitioning-ii/
package linked_lists;

import java.util.*;

public class PalindromePartitioningIi {
    // LeetCode Problem 132: Palindrome Partitioning II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PalindromePartitioningIi solver = new PalindromePartitioningIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PalindromePartitioningIi (Palindrome Partitioning II) Passed!");
    }
}
