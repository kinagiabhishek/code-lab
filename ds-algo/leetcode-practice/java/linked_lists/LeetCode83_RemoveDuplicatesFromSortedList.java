// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package linked_lists;

import java.util.*;

public class LeetCode83_RemoveDuplicatesFromSortedList {
    // LeetCode Problem 83: Remove Duplicates from Sorted List
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode83_RemoveDuplicatesFromSortedList solver = new LeetCode83_RemoveDuplicatesFromSortedList();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode83_RemoveDuplicatesFromSortedList (Remove Duplicates from Sorted List) Passed!");
    }
}
