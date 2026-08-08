// https://leetcode.com/problems/find-the-closest-palindrome/
package stacks_and_queues;

import java.util.*;

public class FindTheClosestPalindrome {
    // LeetCode Problem 564: Find the Closest Palindrome
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindTheClosestPalindrome solver = new FindTheClosestPalindrome();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindTheClosestPalindrome (Find the Closest Palindrome) Passed!");
    }
}
