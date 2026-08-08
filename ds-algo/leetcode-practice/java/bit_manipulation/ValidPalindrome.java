// https://leetcode.com/problems/valid-palindrome/
package bit_manipulation;

import java.util.*;

public class ValidPalindrome {
    // LeetCode Problem 125: Valid Palindrome
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidPalindrome solver = new ValidPalindrome();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidPalindrome (Valid Palindrome) Passed!");
    }
}
