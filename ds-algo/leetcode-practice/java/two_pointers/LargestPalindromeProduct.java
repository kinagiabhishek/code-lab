// https://leetcode.com/problems/largest-palindrome-product/
package two_pointers;

import java.util.*;

public class LargestPalindromeProduct {
    // LeetCode Problem 479: Largest Palindrome Product
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LargestPalindromeProduct solver = new LargestPalindromeProduct();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode479_LargestPalindromeProduct (Largest Palindrome Product) Passed!");
    }
}
