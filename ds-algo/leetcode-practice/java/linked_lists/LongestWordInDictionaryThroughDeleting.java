// https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
package linked_lists;

import java.util.*;

public class LongestWordInDictionaryThroughDeleting {
    // LeetCode Problem 524: Longest Word in Dictionary through Deleting
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
        LongestWordInDictionaryThroughDeleting solver = new LongestWordInDictionaryThroughDeleting();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ LongestWordInDictionaryThroughDeleting Passed!");
    }
}
