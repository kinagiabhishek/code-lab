// https://leetcode.com/problems/reverse-linked-list/
package backtracking;

import java.util.*;

public class ReverseLinkedList {
    // LeetCode Problem 206: Reverse Linked List
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList solver = new ReverseLinkedList();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ ReverseLinkedList Passed!");
    }
}
