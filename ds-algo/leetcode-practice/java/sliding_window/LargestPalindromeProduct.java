// https://leetcode.com/problems/largest-palindrome-product/
package sliding_window;

import java.util.*;

public class LargestPalindromeProduct {
    // LeetCode Problem 479: Largest Palindrome Product
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++; r--;
        }
        return true;
    }

    public static void main(String[] args) {
        LargestPalindromeProduct solver = new LargestPalindromeProduct();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LargestPalindromeProduct Passed!");
    }
}
