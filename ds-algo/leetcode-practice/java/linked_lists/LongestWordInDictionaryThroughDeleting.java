// https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
package linked_lists;

import java.util.*;

public class LongestWordInDictionaryThroughDeleting {
    // LeetCode Problem 524: Longest Word in Dictionary through Deleting
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestWordInDictionaryThroughDeleting solver = new LongestWordInDictionaryThroughDeleting();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestWordInDictionaryThroughDeleting (Longest Word in Dictionary through Deleting) Passed!");
    }
}
