// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package linked_lists;

import java.util.*;

public class RemoveDuplicatesFromSortedList {
public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) current.next = current.next.next;
            else current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solver = new RemoveDuplicatesFromSortedList();
        ListNode head = new ListNode(1); head.next = new ListNode(1); head.next.next = new ListNode(2);
        ListNode res = solver.deleteDuplicates(head);
        assert res.val == 1 && res.next.val == 2;
        System.out.println("✅ RemoveDuplicatesFromSortedList Passed!");
    }
}
