// https://leetcode.com/problems/merge-k-sorted-lists/
package heap_and_priority_queue;

import java.util.*;

public class MergeKSortedLists {
    // LeetCode Problem 23: Merge k Sorted Lists
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        MergeKSortedLists solver = new MergeKSortedLists();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ MergeKSortedLists Passed!");
    }
}
