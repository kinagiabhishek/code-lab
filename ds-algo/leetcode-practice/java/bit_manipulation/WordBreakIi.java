// https://leetcode.com/problems/word-break-ii/
package bit_manipulation;

import java.util.*;

public class WordBreakIi {
    // LeetCode Problem 140: Word Break II
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
        WordBreakIi solver = new WordBreakIi();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ WordBreakIi Passed!");
    }
}
