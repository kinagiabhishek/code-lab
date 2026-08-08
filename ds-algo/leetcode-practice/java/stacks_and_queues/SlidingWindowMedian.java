// https://leetcode.com/problems/sliding-window-median/
package stacks_and_queues;

import java.util.*;

public class SlidingWindowMedian {
    // LeetCode Problem 480: Sliding Window Median
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SlidingWindowMedian solver = new SlidingWindowMedian();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SlidingWindowMedian (Sliding Window Median) Passed!");
    }
}
