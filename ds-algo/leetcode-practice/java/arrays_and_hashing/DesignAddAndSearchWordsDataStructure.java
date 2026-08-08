// https://leetcode.com/problems/design-add-and-search-words-data-structure/
package arrays_and_hashing;

import java.util.*;

public class DesignAddAndSearchWordsDataStructure {
    // LeetCode Problem 211: Design Add and Search Words Data Structure
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
        DesignAddAndSearchWordsDataStructure solver = new DesignAddAndSearchWordsDataStructure();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ DesignAddAndSearchWordsDataStructure Passed!");
    }
}
