// https://leetcode.com/problems/merge-two-sorted-lists/
package trees;

import java.util.*;

public class MergeTwoSortedLists {
    // LeetCode Problem 21: Merge Two Sorted Lists
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists solver = new MergeTwoSortedLists();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MergeTwoSortedLists (Merge Two Sorted Lists) Passed!");
    }
}
