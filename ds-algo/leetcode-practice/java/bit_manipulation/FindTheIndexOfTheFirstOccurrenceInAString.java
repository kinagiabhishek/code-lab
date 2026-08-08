// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package bit_manipulation;

import java.util.*;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    // LeetCode Problem 28: Find the Index of the First Occurrence in a String
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
        FindTheIndexOfTheFirstOccurrenceInAString solver = new FindTheIndexOfTheFirstOccurrenceInAString();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ FindTheIndexOfTheFirstOccurrenceInAString Passed!");
    }
}
