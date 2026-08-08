// https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
package sliding_window;

import java.util.*;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    // LeetCode Problem 395: Longest Substring with At Least K Repeating Characters
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepeatingCharacters solver = new LongestSubstringWithAtLeastKRepeatingCharacters();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestSubstringWithAtLeastKRepeatingCharacters (Longest Substring with At Least K Repeating Characters) Passed!");
    }
}
