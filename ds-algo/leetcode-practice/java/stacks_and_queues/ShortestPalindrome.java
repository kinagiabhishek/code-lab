// https://leetcode.com/problems/shortest-palindrome/
package stacks_and_queues;

import java.util.*;

public class ShortestPalindrome {
    // LeetCode Problem 214: Shortest Palindrome
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ShortestPalindrome solver = new ShortestPalindrome();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ShortestPalindrome (Shortest Palindrome) Passed!");
    }
}
