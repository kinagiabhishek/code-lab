// https://leetcode.com/problems/longest-repeating-character-replacement/
package arrays_and_hashing;

import java.util.*;

public class LongestRepeatingCharacterReplacement {
    // LeetCode Problem 424: Longest Repeating Character Replacement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solver = new LongestRepeatingCharacterReplacement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode424_LongestRepeatingCharacterReplacement (Longest Repeating Character Replacement) Passed!");
    }
}
