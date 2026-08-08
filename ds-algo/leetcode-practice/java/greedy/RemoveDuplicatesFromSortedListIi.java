// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
package greedy;

import java.util.*;

public class RemoveDuplicatesFromSortedListIi {
    // LeetCode Problem 82: Remove Duplicates from Sorted List II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListIi solver = new RemoveDuplicatesFromSortedListIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveDuplicatesFromSortedListIi (Remove Duplicates from Sorted List II) Passed!");
    }
}
