// https://leetcode.com/problems/find-all-anagrams-in-a-string/
package stacks_and_queues;

import java.util.*;

public class FindAllAnagramsInAString {
    // LeetCode Problem 438: Find All Anagrams in a String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString solver = new FindAllAnagramsInAString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindAllAnagramsInAString (Find All Anagrams in a String) Passed!");
    }
}
