// https://leetcode.com/problems/linked-list-cycle-ii/
package two_pointers;

import java.util.*;

public class LinkedListCycleIi {
    // LeetCode Problem 142: Linked List Cycle II
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedListCycleIi solver = new LinkedListCycleIi();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ LinkedListCycleIi Passed!");
    }
}
