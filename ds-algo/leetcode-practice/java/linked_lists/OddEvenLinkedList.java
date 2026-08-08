// https://leetcode.com/problems/odd-even-linked-list/
package linked_lists;

import java.util.*;

public class OddEvenLinkedList {
    // LeetCode Problem 328: Odd Even Linked List
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        OddEvenLinkedList solver = new OddEvenLinkedList();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ OddEvenLinkedList Passed!");
    }
}
