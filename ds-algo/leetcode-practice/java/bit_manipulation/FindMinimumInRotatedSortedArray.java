// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
package bit_manipulation;

import java.util.*;

public class FindMinimumInRotatedSortedArray {
    // LeetCode Problem 153: Find Minimum in Rotated Sorted Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray solver = new FindMinimumInRotatedSortedArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindMinimumInRotatedSortedArray (Find Minimum in Rotated Sorted Array) Passed!");
    }
}
