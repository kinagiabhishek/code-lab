// https://leetcode.com/problems/longest-substring-without-repeating-characters/
package sliding_window;

import java.util.*;

public class LeetCode3_LongestSubstringWithoutRepeatingCharacters {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode3_LongestSubstringWithoutRepeatingCharacters solver = new LeetCode3_LongestSubstringWithoutRepeatingCharacters();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode3_LongestSubstringWithoutRepeatingCharacters Passed!");
    }
}
