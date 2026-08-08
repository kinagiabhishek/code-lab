// https://leetcode.com/problems/length-of-last-word/
package two_pointers;

import java.util.*;

public class LengthOfLastWord {
    // LeetCode Problem 58: Length of Last Word
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
        LengthOfLastWord solver = new LengthOfLastWord();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LengthOfLastWord Passed!");
    }
}
