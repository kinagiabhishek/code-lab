// https://leetcode.com/problems/longest-repeating-character-replacement/
package sliding_window;
public class LeetCode424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; int l = 0, maxCount = 0, maxLen = 0;
        for (int r = 0; r < s.length(); r++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(r) - 'A']);
            while (r - l + 1 - maxCount > k) { count[s.charAt(l) - 'A']--; l++; }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        assert new LeetCode424_LongestRepeatingCharacterReplacement().characterReplacement("ABAB", 2) == 4;
        System.out.println("✅ LeetCode424_LongestRepeatingCharacterReplacement Passed!");
    }
}
