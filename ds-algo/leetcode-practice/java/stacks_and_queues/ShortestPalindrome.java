// https://leetcode.com/problems/shortest-palindrome/
package stacks_and_queues;

import java.util.*;

public class ShortestPalindrome {
    // LeetCode Problem 214: Shortest Palindrome
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
        ShortestPalindrome solver = new ShortestPalindrome();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ ShortestPalindrome Passed!");
    }
}
