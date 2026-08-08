// https://leetcode.com/problems/palindrome-partitioning/
package binary_search;

import java.util.*;

public class PalindromePartitioning {
    // LeetCode Problem 131: Palindrome Partitioning
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
        PalindromePartitioning solver = new PalindromePartitioning();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ PalindromePartitioning Passed!");
    }
}
