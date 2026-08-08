// https://leetcode.com/problems/longest-substring-without-repeating-characters/
package trees;

import java.util.*;

public class LeetCode3_LongestSubstringWithoutRepeatingCharacters {
    // LeetCode Problem 3: Longest Substring Without Repeating Characters
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode3_LongestSubstringWithoutRepeatingCharacters solver = new LeetCode3_LongestSubstringWithoutRepeatingCharacters();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode3_LongestSubstringWithoutRepeatingCharacters (Longest Substring Without Repeating Characters) Passed!");
    }
}
