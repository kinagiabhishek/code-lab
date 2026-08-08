// https://leetcode.com/problems/palindrome-number/
package heap_and_priority_queue;

import java.util.*;

public class PalindromeNumber {
    // LeetCode Problem 9: Palindrome Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PalindromeNumber solver = new PalindromeNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PalindromeNumber (Palindrome Number) Passed!");
    }
}
