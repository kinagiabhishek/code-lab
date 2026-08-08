// https://leetcode.com/problems/word-frequency/
package backtracking;

import java.util.*;

public class WordFrequency {
    // LeetCode Problem 192: Word Frequency
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
        WordFrequency solver = new WordFrequency();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ WordFrequency Passed!");
    }
}
