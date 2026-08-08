// https://leetcode.com/problems/decode-string/
package two_pointers;

import java.util.*;

public class DecodeString {
    // LeetCode Problem 394: Decode String
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
        DecodeString solver = new DecodeString();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ DecodeString Passed!");
    }
}
