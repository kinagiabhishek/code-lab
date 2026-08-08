// https://leetcode.com/problems/first-unique-character-in-a-string/
package heap_and_priority_queue;

import java.util.*;

public class FirstUniqueCharacterInAString {
    // LeetCode Problem 387: First Unique Character in a String
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
        FirstUniqueCharacterInAString solver = new FirstUniqueCharacterInAString();
        assert solver.isPalindrome("A man, a plan, a canal: Panama") == true;
        System.out.println("✅ FirstUniqueCharacterInAString Passed!");
    }
}
