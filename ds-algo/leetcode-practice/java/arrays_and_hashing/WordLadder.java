// https://leetcode.com/problems/word-ladder/
package arrays_and_hashing;

import java.util.*;

public class WordLadder {
    // LeetCode Problem 127: Word Ladder
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
        WordLadder solver = new WordLadder();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ WordLadder Passed!");
    }
}
