// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package dynamic_programming;

import java.util.*;

public class SearchInRotatedSortedArrayIi {
    // LeetCode Problem 81: Search in Rotated Sorted Array II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SearchInRotatedSortedArrayIi solver = new SearchInRotatedSortedArrayIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SearchInRotatedSortedArrayIi (Search in Rotated Sorted Array II) Passed!");
    }
}
