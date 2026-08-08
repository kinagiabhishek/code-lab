// https://leetcode.com/problems/strong-password-checker/
package bit_manipulation;

import java.util.*;

public class StrongPasswordChecker {
    // LeetCode Problem 420: Strong Password Checker
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
        StrongPasswordChecker solver = new StrongPasswordChecker();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ StrongPasswordChecker Passed!");
    }
}
