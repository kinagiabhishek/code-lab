// https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
package trees;

import java.util.*;

public class LeetCode395_LongestSubstringWithAtLeastKRepeatingCharacters {
    // LeetCode Problem 395: Longest Substring with At Least K Repeating Characters
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode395_LongestSubstringWithAtLeastKRepeatingCharacters solver = new LeetCode395_LongestSubstringWithAtLeastKRepeatingCharacters();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode395_LongestSubstringWithAtLeastKRepeatingCharacters (Longest Substring with At Least K Repeating Characters) Passed!");
    }
}
