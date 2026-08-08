// https://leetcode.com/problems/reverse-words-in-a-string-iii/
package dynamic_programming;

import java.util.*;

public class ReverseWordsInAStringIii {
    // LeetCode Problem 557: Reverse Words in a String III
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
        ReverseWordsInAStringIii solver = new ReverseWordsInAStringIii();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ ReverseWordsInAStringIii Passed!");
    }
}
