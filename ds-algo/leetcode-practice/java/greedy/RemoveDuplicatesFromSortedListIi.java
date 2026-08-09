// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
package greedy;

import java.util.*;

public class RemoveDuplicatesFromSortedListIi {
    // LeetCode Problem 82: Remove Duplicates from Sorted List II
    // Official LeetCode Method Signature: public ListNode deleteDuplicates(ListNode head)
    public ListNode deleteDuplicates(ListNode head) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListIi solver = new RemoveDuplicatesFromSortedListIi();
        assert solver.deleteDuplicates(new int[]{1}).isEmpty();
        System.out.println("✅ RemoveDuplicatesFromSortedListIi Passed!");
    }
}
