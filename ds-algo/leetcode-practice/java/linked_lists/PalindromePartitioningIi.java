// https://leetcode.com/problems/palindrome-partitioning-ii/
package linked_lists;

import java.util.*;

public class PalindromePartitioningIi {
    // LeetCode Problem 132: Palindrome Partitioning II
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
        PalindromePartitioningIi solver = new PalindromePartitioningIi();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ PalindromePartitioningIi Passed!");
    }
}
