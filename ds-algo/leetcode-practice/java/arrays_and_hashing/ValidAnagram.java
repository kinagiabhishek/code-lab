// https://leetcode.com/problems/valid-anagram/
package arrays_and_hashing;

import java.util.*;

public class ValidAnagram {
public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++; counts[t.charAt(i) - 'a']--;
        }
        for (int c : counts) if (c != 0) return false;
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram solver = new ValidAnagram();
        assert solver.isAnagram("anagram", "nagaram") == true;
        System.out.println("✅ ValidAnagram Passed!");
    }
}
