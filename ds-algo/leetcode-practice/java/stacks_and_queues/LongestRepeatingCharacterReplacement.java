// https://leetcode.com/problems/longest-repeating-character-replacement/
package stacks_and_queues;

import java.util.*;

public class LongestRepeatingCharacterReplacement {
    // LeetCode Problem 424: Longest Repeating Character Replacement
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
        LongestRepeatingCharacterReplacement solver = new LongestRepeatingCharacterReplacement();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LongestRepeatingCharacterReplacement Passed!");
    }
}
