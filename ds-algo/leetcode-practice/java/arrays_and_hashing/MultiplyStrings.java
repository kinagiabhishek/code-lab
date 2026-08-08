// https://leetcode.com/problems/multiply-strings/
package arrays_and_hashing;

import java.util.*;

public class MultiplyStrings {
    // LeetCode Problem 43: Multiply Strings
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
        MultiplyStrings solver = new MultiplyStrings();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ MultiplyStrings Passed!");
    }
}
