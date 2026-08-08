// https://leetcode.com/problems/find-the-closest-palindrome/
package stacks_and_queues;

import java.util.*;

public class FindTheClosestPalindrome {
    // LeetCode Problem 564: Find the Closest Palindrome
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
        FindTheClosestPalindrome solver = new FindTheClosestPalindrome();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ FindTheClosestPalindrome Passed!");
    }
}
