// https://leetcode.com/problems/reverse-vowels-of-a-string/
package heap_and_priority_queue;

import java.util.*;

public class ReverseVowelsOfAString {
    // LeetCode Problem 345: Reverse Vowels of a String
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
        ReverseVowelsOfAString solver = new ReverseVowelsOfAString();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ ReverseVowelsOfAString Passed!");
    }
}
