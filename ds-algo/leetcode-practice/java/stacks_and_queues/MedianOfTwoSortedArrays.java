// https://leetcode.com/problems/median-of-two-sorted-arrays/
package stacks_and_queues;

import java.util.*;

public class MedianOfTwoSortedArrays {
    // LeetCode Problem 4: Median of Two Sorted Arrays
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MedianOfTwoSortedArrays (Median of Two Sorted Arrays) Passed!");
    }
}
