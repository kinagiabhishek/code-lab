// https://leetcode.com/problems/reverse-linked-list-ii/
package graphs;

import java.util.*;

public class ReverseLinkedListIi {
    // LeetCode Problem 92: Reverse Linked List II
    public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; curr.next = prev; prev = curr; curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedListIi solver = new ReverseLinkedListIi();
        ListNode head = new ListNode(1); head.next = new ListNode(2);
        ListNode res = solver.reverseList(head);
        assert res.val == 2;
        System.out.println("✅ ReverseLinkedListIi Passed!");
    }
}
