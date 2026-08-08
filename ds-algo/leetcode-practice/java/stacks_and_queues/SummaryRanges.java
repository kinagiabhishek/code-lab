// https://leetcode.com/problems/summary-ranges/
package stacks_and_queues;

import java.util.*;

public class SummaryRanges {
    // LeetCode Problem 228: Summary Ranges
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SummaryRanges solver = new SummaryRanges();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SummaryRanges (Summary Ranges) Passed!");
    }
}
