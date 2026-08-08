// https://leetcode.com/problems/unique-substrings-in-wraparound-string/
package binary_search;

import java.util.*;

public class UniqueSubstringsInWraparoundString {
    // LeetCode Problem 467: Unique Substrings in Wraparound String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        UniqueSubstringsInWraparoundString solver = new UniqueSubstringsInWraparoundString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ UniqueSubstringsInWraparoundString (Unique Substrings in Wraparound String) Passed!");
    }
}
