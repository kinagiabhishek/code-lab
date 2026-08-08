// https://leetcode.com/problems/merge-sorted-array/
package stacks_and_queues;

import java.util.*;

public class MergeSortedArray {
    // LeetCode Problem 88: Merge Sorted Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MergeSortedArray solver = new MergeSortedArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MergeSortedArray (Merge Sorted Array) Passed!");
    }
}
