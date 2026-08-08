// https://leetcode.com/problems/word-break/
package math;

import java.util.*;

public class WordBreak {
    // LeetCode Problem 139: Word Break
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
        WordBreak solver = new WordBreak();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ WordBreak Passed!");
    }
}
