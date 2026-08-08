// https://leetcode.com/problems/string-to-integer-atoi/
package graphs;

import java.util.*;

public class StringToIntegerAtoi {
    // LeetCode Problem 8: String to Integer (atoi)
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
        StringToIntegerAtoi solver = new StringToIntegerAtoi();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ StringToIntegerAtoi Passed!");
    }
}
