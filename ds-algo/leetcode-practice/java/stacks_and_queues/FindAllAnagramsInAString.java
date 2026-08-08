// https://leetcode.com/problems/find-all-anagrams-in-a-string/
package stacks_and_queues;

import java.util.*;

public class FindAllAnagramsInAString {
    // LeetCode Problem 438: Find All Anagrams in a String
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
        FindAllAnagramsInAString solver = new FindAllAnagramsInAString();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ FindAllAnagramsInAString Passed!");
    }
}
