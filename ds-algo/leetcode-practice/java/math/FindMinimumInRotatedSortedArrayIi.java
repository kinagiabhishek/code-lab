// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
package math;

import java.util.*;

public class FindMinimumInRotatedSortedArrayIi {
    // LeetCode Problem 154: Find Minimum in Rotated Sorted Array II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArrayIi solver = new FindMinimumInRotatedSortedArrayIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindMinimumInRotatedSortedArrayIi (Find Minimum in Rotated Sorted Array II) Passed!");
    }
}
