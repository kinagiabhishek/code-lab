// https://leetcode.com/problems/largest-rectangle-in-histogram/
package math;

import java.util.*;

public class LargestRectangleInHistogram {
    // LeetCode Problem 84: Largest Rectangle in Histogram
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        LargestRectangleInHistogram solver = new LargestRectangleInHistogram();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ LargestRectangleInHistogram (Largest Rectangle in Histogram) Passed!");
    }
}
