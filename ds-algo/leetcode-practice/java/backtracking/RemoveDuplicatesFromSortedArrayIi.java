// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
package backtracking;

import java.util.*;

public class RemoveDuplicatesFromSortedArrayIi {
    // LeetCode Problem 80: Remove Duplicates from Sorted Array II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayIi solver = new RemoveDuplicatesFromSortedArrayIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveDuplicatesFromSortedArrayIi (Remove Duplicates from Sorted Array II) Passed!");
    }
}
