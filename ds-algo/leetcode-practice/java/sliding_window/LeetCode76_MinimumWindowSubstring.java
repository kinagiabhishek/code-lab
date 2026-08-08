// https://leetcode.com/problems/minimum-window-substring/
package sliding_window;
import java.util.HashMap;
import java.util.Map;

public class LeetCode76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        int matched = 0, minLen = s.length() + 1, subStart = 0, l = 0;
        for (int r = 0; r < s.length(); r++) {
            char rightChar = s.charAt(r);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) >= 0) matched++;
            }
            while (matched == t.length()) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    subStart = l;
                }
                char leftChar = s.charAt(l);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) == 0) matched--;
                    map.put(leftChar, map.get(leftChar) + 1);
                }
                l++;
            }
        }
        return minLen > s.length() ? "" : s.substring(subStart, subStart + minLen);
    }
    public static void main(String[] args) {
        LeetCode76_MinimumWindowSubstring solver = new LeetCode76_MinimumWindowSubstring();
        assert solver.minWindow("ADOBECODEBANC", "ABC").equals("BANC");
        System.out.println("✅ LeetCode76_MinimumWindowSubstring Passed!");
    }
}
