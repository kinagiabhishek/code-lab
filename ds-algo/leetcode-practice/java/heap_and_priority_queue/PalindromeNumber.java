// https://leetcode.com/problems/palindrome-number/
package heap_and_priority_queue;

import java.util.*;

public class PalindromeNumber {
    // LeetCode Problem 9: Palindrome Number
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
        PalindromeNumber solver = new PalindromeNumber();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ PalindromeNumber Passed!");
    }
}
