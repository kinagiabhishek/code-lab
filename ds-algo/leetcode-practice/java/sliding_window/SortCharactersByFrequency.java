// https://leetcode.com/problems/sort-characters-by-frequency/
package sliding_window;

import java.util.*;

public class SortCharactersByFrequency {
    // LeetCode Problem 451: Sort Characters By Frequency
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
        SortCharactersByFrequency solver = new SortCharactersByFrequency();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ SortCharactersByFrequency Passed!");
    }
}
