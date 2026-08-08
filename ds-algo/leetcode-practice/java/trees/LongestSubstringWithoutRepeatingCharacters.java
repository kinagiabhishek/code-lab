// https://leetcode.com/problems/longest-substring-without-repeating-characters/
package trees;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); int l = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) { set.remove(s.charAt(l)); l++; }
            set.add(s.charAt(r)); max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
