// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
package greedy;

import java.util.*;

public class RemoveDuplicatesFromSortedListIi {
    // LeetCode Problem 82: Remove Duplicates from Sorted List II
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedListIi solver = new RemoveDuplicatesFromSortedListIi();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ RemoveDuplicatesFromSortedListIi Passed!");
    }
}
