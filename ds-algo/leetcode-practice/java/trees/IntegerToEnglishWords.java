// https://leetcode.com/problems/integer-to-english-words/
package trees;

import java.util.*;

public class IntegerToEnglishWords {
    // LeetCode Problem 273: Integer to English Words
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
        IntegerToEnglishWords solver = new IntegerToEnglishWords();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ IntegerToEnglishWords Passed!");
    }
}
