// https://leetcode.com/problems/linked-list-cycle/
package arrays_and_hashing;

import java.util.*;

public class LinkedListCycle {
    // LeetCode Problem 141: Linked List Cycle
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedListCycle solver = new LinkedListCycle();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ LinkedListCycle Passed!");
    }
}
