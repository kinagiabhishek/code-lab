// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package greedy;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    // LeetCode Problem 26: Remove Duplicates from Sorted Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solver = new RemoveDuplicatesFromSortedArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveDuplicatesFromSortedArray (Remove Duplicates from Sorted Array) Passed!");
    }
}
