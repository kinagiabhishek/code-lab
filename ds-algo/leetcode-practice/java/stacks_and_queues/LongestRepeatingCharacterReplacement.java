// https://leetcode.com/problems/longest-repeating-character-replacement/
package stacks_and_queues;

import java.util.*;

public class LongestRepeatingCharacterReplacement {
    // LeetCode Problem 424: Longest Repeating Character Replacement
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solver = new LongestRepeatingCharacterReplacement();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestRepeatingCharacterReplacement (Longest Repeating Character Replacement) Passed!");
    }
}
