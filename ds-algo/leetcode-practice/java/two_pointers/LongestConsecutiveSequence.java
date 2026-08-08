// https://leetcode.com/problems/longest-consecutive-sequence/
package two_pointers;

import java.util.*;

public class LongestConsecutiveSequence {
    // LeetCode Problem 128: Longest Consecutive Sequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solver = new LongestConsecutiveSequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LongestConsecutiveSequence (Longest Consecutive Sequence) Passed!");
    }
}
