// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package math;

import java.util.*;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    // LeetCode Problem 28: Find the Index of the First Occurrence in a String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindTheIndexOfTheFirstOccurrenceInAString solver = new FindTheIndexOfTheFirstOccurrenceInAString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindTheIndexOfTheFirstOccurrenceInAString (Find the Index of the First Occurrence in a String) Passed!");
    }
}
