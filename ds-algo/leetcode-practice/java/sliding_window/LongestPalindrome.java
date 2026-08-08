// https://leetcode.com/problems/longest-palindrome/
package sliding_window;

import java.util.*;

public class LongestPalindrome {
    // LeetCode Problem 409: Longest Palindrome
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
        LongestPalindrome solver = new LongestPalindrome();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LongestPalindrome Passed!");
    }
}
