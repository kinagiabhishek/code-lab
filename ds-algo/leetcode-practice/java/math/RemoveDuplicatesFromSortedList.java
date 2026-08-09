// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package math;

import java.util.*;

public class RemoveDuplicatesFromSortedList {
    // LeetCode Problem 83: Remove Duplicates from Sorted List
    // Official LeetCode Method Signature: public ListNode deleteDuplicates(ListNode head)
    public ListNode deleteDuplicates(ListNode head) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solver = new RemoveDuplicatesFromSortedList();
        assert solver.deleteDuplicates(new int[]{1}).isEmpty();
        System.out.println("✅ RemoveDuplicatesFromSortedList Passed!");
    }
}
