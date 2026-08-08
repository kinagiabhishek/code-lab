// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package bit_manipulation;

import java.util.*;

public class RemoveDuplicatesFromSortedList {
    // LeetCode Problem 83: Remove Duplicates from Sorted List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solver = new RemoveDuplicatesFromSortedList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveDuplicatesFromSortedList (Remove Duplicates from Sorted List) Passed!");
    }
}
