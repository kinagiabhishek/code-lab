// https://leetcode.com/problems/reverse-words-in-a-string/
package dynamic_programming;

import java.util.*;

public class ReverseWordsInAString {
    // LeetCode Problem 151: Reverse Words in a String
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
        ReverseWordsInAString solver = new ReverseWordsInAString();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ ReverseWordsInAString Passed!");
    }
}
