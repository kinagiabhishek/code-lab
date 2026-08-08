// https://leetcode.com/problems/isomorphic-strings/
package heap_and_priority_queue;

import java.util.*;

public class IsomorphicStrings {
    // LeetCode Problem 205: Isomorphic Strings
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
        IsomorphicStrings solver = new IsomorphicStrings();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ IsomorphicStrings Passed!");
    }
}
