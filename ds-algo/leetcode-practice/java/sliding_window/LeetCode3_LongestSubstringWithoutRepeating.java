package sliding_window;
import java.util.HashSet;
import java.util.Set;

public class LeetCode3_LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LeetCode3_LongestSubstringWithoutRepeating solver = new LeetCode3_LongestSubstringWithoutRepeating();
        assert solver.lengthOfLongestSubstring("abcabcbb") == 3;
        assert solver.lengthOfLongestSubstring("bbbbb") == 1;
        System.out.println("✅ LeetCode3_LongestSubstringWithoutRepeating Passed!");
    }
}
