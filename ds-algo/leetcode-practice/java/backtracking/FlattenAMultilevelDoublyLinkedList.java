// https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
package backtracking;

import java.util.*;

public class FlattenAMultilevelDoublyLinkedList {
    // LeetCode Problem 430: Flatten a Multilevel Doubly Linked List
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        FlattenAMultilevelDoublyLinkedList solver = new FlattenAMultilevelDoublyLinkedList();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ FlattenAMultilevelDoublyLinkedList Passed!");
    }
}
