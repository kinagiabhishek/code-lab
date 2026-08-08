// https://leetcode.com/problems/word-ladder-ii/
package bit_manipulation;

import java.util.*;

public class WordLadderIi {
    // LeetCode Problem 126: Word Ladder II
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
        WordLadderIi solver = new WordLadderIi();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ WordLadderIi Passed!");
    }
}
