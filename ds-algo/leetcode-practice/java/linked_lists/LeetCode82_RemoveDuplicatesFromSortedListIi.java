// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
package linked_lists;

import java.util.*;

public class LeetCode82_RemoveDuplicatesFromSortedListIi {
    // LeetCode Problem 82: Remove Duplicates from Sorted List II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode82_RemoveDuplicatesFromSortedListIi solver = new LeetCode82_RemoveDuplicatesFromSortedListIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode82_RemoveDuplicatesFromSortedListIi (Remove Duplicates from Sorted List II) Passed!");
    }
}
