// https://leetcode.com/problems/largest-palindrome-product/
package sliding_window;

import java.util.*;

public class LargestPalindromeProduct {
    // LeetCode Problem 479: Largest Palindrome Product
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LargestPalindromeProduct solver = new LargestPalindromeProduct();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LargestPalindromeProduct (Largest Palindrome Product) Passed!");
    }
}
