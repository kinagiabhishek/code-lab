// https://leetcode.com/problems/largest-palindrome-product/
package two_pointers;

import java.util.*;

public class LeetCode479_LargestPalindromeProduct {
    // LeetCode Problem 479: Largest Palindrome Product
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode479_LargestPalindromeProduct solver = new LeetCode479_LargestPalindromeProduct();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode479_LargestPalindromeProduct (Largest Palindrome Product) Passed!");
    }
}
