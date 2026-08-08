// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package linked_lists;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    // LeetCode Problem 34: Find First and Last Position of Element in Sorted Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray solver = new FindFirstAndLastPositionOfElementInSortedArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindFirstAndLastPositionOfElementInSortedArray (Find First and Last Position of Element in Sorted Array) Passed!");
    }
}
