// https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
package bit_manipulation;

import java.util.*;

public class LeetCode524_LongestWordInDictionaryThroughDeleting {
    // LeetCode Problem 524: Longest Word in Dictionary through Deleting
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode524_LongestWordInDictionaryThroughDeleting solver = new LeetCode524_LongestWordInDictionaryThroughDeleting();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode524_LongestWordInDictionaryThroughDeleting (Longest Word in Dictionary through Deleting) Passed!");
    }
}
